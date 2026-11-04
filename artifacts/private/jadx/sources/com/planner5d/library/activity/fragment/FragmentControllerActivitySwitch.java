package com.planner5d.library.activity.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
public class FragmentControllerActivitySwitch extends FragmentController implements com.planner5d.library.activity.helper.ui.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f131541e = false;

    private void y(Bundle bundle) {
        if (bundle != null) {
            this.f131541e = new com.planner5d.library.services.utility.j(bundle).f(com.planner5d.library.services.r.switched, false);
        }
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    public com.planner5d.library.activity.helper.ui.d getUiState(Context context) {
        return new com.planner5d.library.activity.helper.ui.d.b(context, this).x();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void onActivityCreatedExtended(@p0 Bundle bundle) {
        y(bundle);
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @p0
    public View onCreateViewExtended(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new View(viewGroup.getContext());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        if (this.f131541e) {
            this.f131538b.e(new com.planner5d.library.activity.helper.event.content.c(jVar.h(com.planner5d.library.services.r.previous, null)));
        } else {
            com.planner5d.library.services.l.f224381g.o(new com.planner5d.library.services.l.a(jVar.t(com.planner5d.library.services.r.activity, null), jVar.h(com.planner5d.library.services.r.data, null)));
            this.f131541e = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(com.planner5d.library.services.r.switched.f224891a, this.f131541e);
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void v(@p0 Bundle bundle) {
        y(bundle);
    }
}
