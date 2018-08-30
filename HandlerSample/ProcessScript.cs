using Android.OS;
using Android.Views;
using Android.Widget;

namespace HandlerSample
{
    class ProcessScript : Handler
    {
        private static ProcessScript instance;
        private TextView textViewResult;

        public ProcessScript(View v)
        {
            textViewResult = (TextView)v.FindViewById(Resource.Id.TextViewResult);
        }

        public static ProcessScript GetInstance(View v)
        {
            if(instance == null)
            {
                instance = new ProcessScript(v);
            }

            return instance;
        }

        public override void HandleMessage(Message msg)
        {
            base.HandleMessage(msg);

            textViewResult.Text = "SOMA: " + msg.Data.GetString("OP");
        }
    }
}