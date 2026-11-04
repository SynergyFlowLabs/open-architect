package com.planner5d.library.activity.fragment.dialog.projectsettings;

import android.content.Context;
import androidx.annotation.NonNull;
import com.planner5d.library.services.utility.h3;

/* JADX INFO: loaded from: classes6.dex */
class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.i f132455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132456b;

    w0(Context context, ac.i iVar) {
        this.f132455a = iVar;
        int iZ = h3.z(context, "shadow_type_" + iVar.f4880a.toLowerCase(), androidx.constraintlayout.core.motion.utils.v.b.f43988e);
        this.f132456b = iZ == 0 ? iVar.f4880a : context.getString(iZ);
    }

    @NonNull
    public String toString() {
        return this.f132456b;
    }
}
