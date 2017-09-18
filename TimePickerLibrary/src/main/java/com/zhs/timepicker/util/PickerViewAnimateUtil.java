package com.zhs.timepicker.util;

import android.content.Context;
import android.view.Gravity;

import com.zhs.timepicker.R;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Sai on 15/8/9.
 */
public class PickerViewAnimateUtil
{
	private static final int INVALID = -1;

	/**
	 * Get default animation resource when not defined by the user
	 * 
	 * @param gravity
	 *            the gravity of the dialog
	 * @param isInAnimation
	 *            determine if is in or out animation. true when is is
	 * @return the id of the animation resource
	 */
	public static int getAnimationResource(int gravity, boolean isInAnimation)
	{
		switch (gravity)
		{
		case Gravity.BOTTOM:
			return isInAnimation ? R.anim.slide_in_bottom : R.anim.slide_out_bottom;
		}
		return INVALID;
	}



	public  static String getTime(Date date)
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}


    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
