using Android.App;
using Android.Widget;
using Android.OS;
using System;
using Java.Lang;

namespace HandlerSample
{
    [Activity(Label = "HandlerSample", MainLauncher = true)]
    public class MainActivity : Activity, IRunnable
    {
        private EditText editTextN1;
        private EditText editTextN2;
        private float result;
        private TextView textViewResult;
        private Handler handler;
        private Bundle bundle;
        private Message message;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.Main);

            handler = ProcessScript.GetInstance(Window.DecorView.RootView);
            bundle = new Bundle();

            Button buttonSum = (Button)FindViewById(Resource.Id.buttonSum);
            editTextN1 = (EditText)FindViewById(Resource.Id.editTextN1);
            editTextN2 = (EditText)FindViewById(Resource.Id.editTextN2);

            buttonSum.Click += OnButtonSumClicked;
        }

        private void OnButtonSumClicked(object sender, EventArgs e)
        {
            if (!editTextN1.Text.Equals("") && !editTextN2.Text.Equals(""))
            {
                result = float.Parse(editTextN1.Text) + float.Parse(editTextN2.Text);

                new Thread(this).Start();
            }
            else
            {
                Toast.MakeText(this, "Campos vazios!", ToastLength.Short).Show();
            }
        }

        public void Run()
        {
            //android.view.ViewRoot$CalledFromWrongThreadException:
            //only the original thread that created a view hierarchy can touch its views.
            textViewResult = (TextView)FindViewById(Resource.Id.TextViewResult);
            textViewResult.Text = "SOMA: " + result;

            //Solution is use Handler to send a message
            //to the main thread message queue tp update the view
            //bundle.PutString("OP", result.ToString());
            //message = new Message();
            //message.Data = bundle;

            //send message
            //handler.SendMessage(message);

            //send message with delay
            //handler.SendMessageDelayed(message, 5000);
        }
    }
}

