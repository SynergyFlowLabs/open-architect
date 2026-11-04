package com.planner5d.library.widget.editor.editor3d.compatibility;

import android.app.Activity;
import android.content.res.Configuration;
import androidx.annotation.l0;
import com.planner5d.library.engine.m;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private vb.a f255388a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f255389b = false;

    class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ vb.a f255390a;

        a(vb.a aVar) {
            this.f255390a = aVar;
        }

        @Override // gc.e
        public void dispose() {
            b.this.d(this.f255390a);
        }

        @Override // com.planner5d.library.engine.m
        public void p() {
        }

        @Override // com.planner5d.library.engine.m
        public void pause() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(vb.a aVar) {
        if (this.f255388a != aVar || aVar == null) {
            return;
        }
        this.f255388a = null;
        e(aVar);
        Activity activityF = f();
        if (activityF == null || !this.f255389b) {
            return;
        }
        activityF.runOnUiThread(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.compatibility.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f255387a.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @l0
    public void k() {
        if (this.f255389b) {
            if (this.f255388a == null) {
                vb.a aVarC = c();
                aVarC.a(new a(aVarC));
                this.f255388a = aVarC;
            }
            this.f255388a.l();
        }
    }

    protected abstract vb.a c();

    protected abstract void e(vb.a aVar);

    protected abstract Activity f();

    protected com.planner5d.library.engine.a g() {
        return this.f255388a;
    }

    public void h(Configuration configuration) {
        vb.a aVar = this.f255388a;
        if (aVar != null) {
            aVar.onConfigurationChanged(configuration);
        }
    }

    public void i() {
        this.f255389b = false;
        vb.a aVar = this.f255388a;
        if (aVar != null) {
            aVar.d();
        }
    }

    @l0
    public void j() {
        this.f255389b = true;
        k();
    }
}
