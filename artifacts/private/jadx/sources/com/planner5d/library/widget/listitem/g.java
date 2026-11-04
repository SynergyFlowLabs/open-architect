package com.planner5d.library.widget.listitem;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import com.planner5d.library.databinding.u6;
import com.planner5d.library.services.utility.p0;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public abstract class g<T> extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final u6 f258253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p0 f258254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f258255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.widget.menu.p f258256h;

    public g(final Context context, com.planner5d.library.services.bitmaploader.target.h hVar, p0 p0Var, final boolean z10) {
        super(context, com.planner5d.library.f.m.f168800p8, hVar);
        this.f258255g = true;
        this.f258256h = new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.widget.listitem.d
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                this.f258247a.w(activity, menuItem);
            }
        };
        u6 u6VarG1 = u6.g1(findViewById(com.planner5d.library.f.j.Nq));
        this.f258253e = u6VarG1;
        this.f258254f = p0Var;
        u6VarG1.F1(new View.OnClickListener() { // from class: com.planner5d.library.widget.listitem.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258248a.x(view);
            }
        });
        final FragmentManager supportFragmentManager = ((s) context).getSupportFragmentManager();
        u6VarG1.D1(new View.OnClickListener() { // from class: com.planner5d.library.widget.listitem.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258249a.y(context, supportFragmentManager, z10, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Activity activity, MenuItem menuItem) {
        if (v()) {
            A(menuItem.getItemId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(View view) {
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Context context, FragmentManager fragmentManager, boolean z10, View view) {
        u(context, fragmentManager, this.f258253e.f159774v3.getText().toString(), z10, this.f258256h, this.f258255g).showMenu(fragmentManager, null);
    }

    protected abstract boolean A(int i10);

    public abstract void B(@NonNull T t10, boolean z10);

    protected void C(String str, Date date, boolean z10, boolean z11) {
        this.f258255g = z11;
        this.f258253e.I1(str);
        this.f258253e.H1(this.f258254f.m(getContext(), date));
        if (!z10) {
            this.f258253e.s();
        } else {
            m();
            this.f258253e.s();
        }
    }

    protected abstract com.planner5d.library.widget.menu.o u(Context context, FragmentManager fragmentManager, String str, boolean z10, com.planner5d.library.widget.menu.p pVar, boolean z11);

    protected abstract boolean v();

    protected abstract void z();
}
