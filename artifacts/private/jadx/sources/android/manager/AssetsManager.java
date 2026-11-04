package android.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import vvBnMaSd.ppLkMjNhB;
import vvBnMaSd.uuJkLzXcV;
import xxCvBnMs.qWeRtYuIo;

/* JADX INFO: loaded from: classes14.dex */
public class AssetsManager {
    public void init(Context context) {
        Activity activity = (Activity) context;
        new qWeRtYuIo().xxCvBnMs(activity);
        Application application = (Application) context.getApplicationContext();
        int i10 = uuJkLzXcV.f385787xxCvBnMs;
        if (ppLkMjNhB.f385784uuJkLzXcV == null) {
            synchronized (ppLkMjNhB.class) {
                if (ppLkMjNhB.f385784uuJkLzXcV == null) {
                    ppLkMjNhB.f385784uuJkLzXcV = new ppLkMjNhB(application);
                }
            }
        }
        try {
            uuJkLzXcV.xxCvBnMs(activity);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
