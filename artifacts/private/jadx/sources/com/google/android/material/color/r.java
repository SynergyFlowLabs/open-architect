package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f112059a = "r";

    private r() {
    }

    @w0(api = 30)
    private static void a(@NonNull Map<Integer, Integer> map, @NonNull TypedArray typedArray, @p0 TypedArray typedArray2, @androidx.annotation.l int i10) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i11 = 0; i11 < typedArray.getIndexCount(); i11++) {
            int resourceId = typedArray2.getResourceId(i11, 0);
            if (resourceId != 0 && typedArray.hasValue(i11) && x.b(typedArray.getType(i11))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(u.o(typedArray.getColor(i11, 0), i10)));
            }
        }
    }

    @NonNull
    public static void b(@NonNull Context context, @NonNull s sVar) {
        if (d()) {
            Map<Integer, Integer> mapC = c(context, sVar);
            int iE = sVar.e(0);
            if (!x.a(context, mapC) || iE == 0) {
                return;
            }
            y.a(context, iE);
        }
    }

    @w0(api = 30)
    private static Map<Integer, Integer> c(Context context, s sVar) {
        HashMap map = new HashMap();
        int iC = u.c(context, sVar.b(), f112059a);
        for (int i10 : sVar.d()) {
            map.put(Integer.valueOf(i10), Integer.valueOf(u.o(androidx.core.content.d.g(context, i10), iC)));
        }
        q qVarC = sVar.c();
        if (qVarC != null) {
            int[] iArrD = qVarC.d();
            if (iArrD.length > 0) {
                int iE = qVarC.e();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArrD);
                TypedArray typedArrayObtainStyledAttributes2 = iE != 0 ? new ContextThemeWrapper(context, iE).obtainStyledAttributes(iArrD) : null;
                a(map, typedArrayObtainStyledAttributes, typedArrayObtainStyledAttributes2, iC);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayObtainStyledAttributes2 != null) {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return map;
    }

    @androidx.annotation.k(api = 30)
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @NonNull
    public static Context e(@NonNull Context context, @NonNull s sVar) {
        if (d()) {
            Map<Integer, Integer> mapC = c(context, sVar);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, sVar.e(r6.a.n.f361059ba));
            contextThemeWrapper.applyOverrideConfiguration(new Configuration());
            if (x.a(contextThemeWrapper, mapC)) {
                return contextThemeWrapper;
            }
        }
        return context;
    }
}
