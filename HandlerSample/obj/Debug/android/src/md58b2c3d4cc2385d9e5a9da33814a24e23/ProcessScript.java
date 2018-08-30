package md58b2c3d4cc2385d9e5a9da33814a24e23;


public class ProcessScript
	extends android.os.Handler
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_handleMessage:(Landroid/os/Message;)V:GetHandleMessage_Landroid_os_Message_Handler\n" +
			"";
		mono.android.Runtime.register ("HandlerSample.ProcessScript, HandlerSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ProcessScript.class, __md_methods);
	}


	public ProcessScript ()
	{
		super ();
		if (getClass () == ProcessScript.class)
			mono.android.TypeManager.Activate ("HandlerSample.ProcessScript, HandlerSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public ProcessScript (android.os.Handler.Callback p0)
	{
		super (p0);
		if (getClass () == ProcessScript.class)
			mono.android.TypeManager.Activate ("HandlerSample.ProcessScript, HandlerSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Handler+ICallback, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public ProcessScript (android.os.Looper p0)
	{
		super (p0);
		if (getClass () == ProcessScript.class)
			mono.android.TypeManager.Activate ("HandlerSample.ProcessScript, HandlerSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Looper, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public ProcessScript (android.os.Looper p0, android.os.Handler.Callback p1)
	{
		super (p0, p1);
		if (getClass () == ProcessScript.class)
			mono.android.TypeManager.Activate ("HandlerSample.ProcessScript, HandlerSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Looper, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.OS.Handler+ICallback, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}

	public ProcessScript (android.view.View p0)
	{
		super ();
		if (getClass () == ProcessScript.class)
			mono.android.TypeManager.Activate ("HandlerSample.ProcessScript, HandlerSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void handleMessage (android.os.Message p0)
	{
		n_handleMessage (p0);
	}

	private native void n_handleMessage (android.os.Message p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
