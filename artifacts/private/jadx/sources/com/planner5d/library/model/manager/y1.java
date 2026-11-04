package com.planner5d.library.model.manager;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class y1 implements x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.activity.helper.event.content.a f222401c = null;

    public com.planner5d.library.activity.helper.event.content.a a() {
        return this.f222401c;
    }

    public com.planner5d.library.services.utility.k3 b(com.planner5d.library.activity.helper.event.content.a aVar) {
        if (aVar != null) {
            return aVar.g();
        }
        return null;
    }

    public com.planner5d.library.services.utility.k3 c() {
        return b(this.f222401c);
    }

    @NonNull
    public com.planner5d.library.activity.helper.event.content.c d() {
        com.planner5d.library.activity.helper.event.content.a aVarF = f();
        return aVarF != null ? new com.planner5d.library.activity.helper.event.content.c(aVarF) : new com.planner5d.library.activity.helper.event.content.c(com.planner5d.library.view.application.c.f244831c.h(), (Bundle) null);
    }

    @androidx.annotation.p0
    public com.planner5d.library.activity.helper.event.content.a f() {
        com.planner5d.library.activity.helper.event.content.a aVarA = a();
        if (aVarA != null) {
            return aVarA.h();
        }
        return null;
    }

    public boolean h() {
        return f() != null;
    }

    public void i(com.planner5d.library.activity.helper.event.content.a aVar) {
        this.f222401c = aVar;
    }
}
