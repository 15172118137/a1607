package com.android.cxk.liwushuo.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/6.
 */
public class Utils {
    public static String formatDate(long time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM月dd日 EE");
        return simpleDateFormat.format(new Date(time));
    }
}
