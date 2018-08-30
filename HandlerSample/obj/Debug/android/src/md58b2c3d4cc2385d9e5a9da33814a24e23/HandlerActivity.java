package md58b2c3d4cc2385d9e5a9da33814a24e23;


public class HandlerActivity
	extends md58b2c3d4cc2385d9e5a9da33814a24e23.MainActivity
	implements
		mono.android.IGCUserPeer,
		java.lang.Runnable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("HandlerSample.HandlerActivity, HandlerSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", HandlerActivity.class, __md_methods);
	}


	public HandlerActivity ()
	{
		super ();
		if (getClass () == HandlerActivity.class)
			mono.android.TypeManager.Activate ("HandlerSample.HandlerActivity, HandlerSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

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
