package com.planner5d.library.activity.tutorial;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.m1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.z0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
public class p implements x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected Application f141864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.config.p f141865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    protected z0 f141866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f141867f = null;

    @ij.a
    public p() {
    }

    private JSONObject a() throws Throwable {
        InputStream inputStreamOpen;
        if (this.f141867f == null) {
            InputStream inputStream = null;
            try {
                z0 z0Var = this.f141866e;
                inputStreamOpen = this.f141864c.getAssets().open("tutorials.json");
                try {
                    this.f141867f = z0Var.a(inputStreamOpen);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException | JSONException unused2) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException | JSONException unused5) {
                inputStreamOpen = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return this.f141867f;
    }

    private String b(String str) throws Throwable {
        JSONObject jSONObjectA = a();
        if (jSONObjectA != null) {
            try {
                if (jSONObjectA.has(str)) {
                    return com.planner5d.library.services.r.tutorialFinished.f224891a + "_" + jSONObjectA.getJSONObject(str).getString(com.planner5d.library.services.r.group.f224891a);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public boolean c(String str) throws Throwable {
        String strB = b(str);
        return strB != null && this.f141865d.x(strB) && this.f141865d.N(strB, false);
    }

    public s[] d(String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA = a();
        if (jSONObjectA == null || !jSONObjectA.has(str)) {
            return new s[0];
        }
        try {
            JSONArray jSONArray = jSONObjectA.getJSONObject(str).getJSONArray(com.planner5d.library.services.r.pages.f224891a);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String str2 = "tutorial_" + jSONArray.getString(i10);
                int iZ = h3.z(this.f141864c, str2 + "_title", androidx.constraintlayout.core.motion.utils.v.b.f43988e);
                int iZ2 = h3.z(this.f141864c, str2, androidx.constraintlayout.core.motion.utils.v.b.f43988e);
                if (iZ <= 0 || iZ2 <= 0) {
                    break;
                    break;
                }
                int iZ3 = h3.z(this.f141864c, str2, "color");
                arrayList.add(new s(this.f141864c.getString(iZ), this.f141864c.getString(iZ2), iZ3 > 0 ? androidx.core.content.d.g(this.f141864c, iZ3) : 16777215, h3.z(this.f141864c, str2, "drawable")));
            }
            return (s[]) arrayList.toArray(new s[0]);
        } catch (JSONException unused) {
            return new s[0];
        }
    }

    @e.a({"ApplySharedPref"})
    @m1
    public void f(String str) throws Throwable {
        String strB = b(str);
        if (strB != null) {
            this.f141865d.M(strB, true);
        }
    }

    public void h(String str, Activity activity) {
        if (!c(str)) {
            h3.j0(activity, Tutorial.class, new com.planner5d.library.services.utility.i().j(com.planner5d.library.services.r.tutorialName, str).a());
        }
    }
}
