package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.provider.Settings;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: loaded from: classes13.dex */
public class SystemSettings {
    private static final Twig twig = LumberMill.getLogger();

    public static float getTransitionScale(Context context) {
        try {
            return Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale");
        } catch (Exception e10) {
            twig.internal("Couldn't get animation scale: " + e10.getMessage());
            return 1.0f;
        }
    }
}
