package androidx.media3.ui;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.b4;
import androidx.media3.common.c4;
import androidx.media3.common.e4;
import androidx.media3.common.i4;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f69874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f69875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<i4.a> f69876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f69877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.g1
    private int f69878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f69880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private e1 f69882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n6<b4, c4> f69884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private Comparator<androidx.media3.common.w> f69885l;

    public interface a {
        void a(boolean z10, Map<b4, c4> map);
    }

    public h1(Context context, CharSequence charSequence, List<i4.a> list, a aVar) {
        this.f69874a = context;
        this.f69875b = charSequence;
        this.f69876c = l6.w(list);
        this.f69877d = aVar;
        this.f69884k = n6.q();
    }

    public static /* synthetic */ void a(androidx.media3.common.z0 z0Var, int i10, boolean z10, Map map) {
        if (z0Var.P0(29)) {
            e4.c cVarI = z0Var.V0().I();
            cVarI.w0(i10, z10);
            cVarI.J(i10);
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                cVarI.F((c4) it.next());
            }
            z0Var.n1(cVarI.G());
        }
    }

    @androidx.annotation.p0
    private Dialog d() {
        try {
            Class cls = Integer.TYPE;
            Object objNewInstance = androidx.appcompat.app.c.a.class.getConstructor(Context.class, cls).newInstance(this.f69874a, Integer.valueOf(this.f69878e));
            View viewInflate = LayoutInflater.from((Context) androidx.appcompat.app.c.a.class.getMethod("getContext", null).invoke(objNewInstance, null)).inflate(v0.i.f70355k, (ViewGroup) null);
            DialogInterface.OnClickListener onClickListenerO = o(viewInflate);
            androidx.appcompat.app.c.a.class.getMethod("setTitle", CharSequence.class).invoke(objNewInstance, this.f69875b);
            androidx.appcompat.app.c.a.class.getMethod("setView", View.class).invoke(objNewInstance, viewInflate);
            androidx.appcompat.app.c.a.class.getMethod("setPositiveButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(R.string.ok), onClickListenerO);
            androidx.appcompat.app.c.a.class.getMethod("setNegativeButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(R.string.cancel), null);
            return (Dialog) androidx.appcompat.app.c.a.class.getMethod("create", null).invoke(objNewInstance, null);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    private Dialog e() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f69874a, this.f69878e);
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(v0.i.f70355k, (ViewGroup) null);
        return builder.setTitle(this.f69875b).setView(viewInflate).setPositiveButton(R.string.ok, o(viewInflate)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    private DialogInterface.OnClickListener o(View view) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) view.findViewById(v0.g.P0);
        trackSelectionView.setAllowMultipleOverrides(this.f69880g);
        trackSelectionView.setAllowAdaptiveSelections(this.f69879f);
        trackSelectionView.setShowDisableOption(this.f69881h);
        e1 e1Var = this.f69882i;
        if (e1Var != null) {
            trackSelectionView.setTrackNameProvider(e1Var);
        }
        trackSelectionView.d(this.f69876c, this.f69883j, this.f69884k, this.f69885l, null);
        return new DialogInterface.OnClickListener() { // from class: androidx.media3.ui.f1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                h1 h1Var = this.f69830a;
                TrackSelectionView trackSelectionView2 = trackSelectionView;
                h1Var.f69877d.a(trackSelectionView2.getIsDisabled(), trackSelectionView2.getOverrides());
            }
        };
    }

    public Dialog c() {
        Dialog dialogD = d();
        return dialogD == null ? e() : dialogD;
    }

    public h1 f(boolean z10) {
        this.f69879f = z10;
        return this;
    }

    public h1 g(boolean z10) {
        this.f69880g = z10;
        return this;
    }

    public h1 h(boolean z10) {
        this.f69883j = z10;
        return this;
    }

    public h1 i(@androidx.annotation.p0 c4 c4Var) {
        return j(c4Var == null ? Collections.EMPTY_MAP : n6.s(c4Var.f60470a, c4Var));
    }

    public h1 j(Map<b4, c4> map) {
        this.f69884k = n6.g(map);
        return this;
    }

    public h1 k(boolean z10) {
        this.f69881h = z10;
        return this;
    }

    public h1 l(@androidx.annotation.g1 int i10) {
        this.f69878e = i10;
        return this;
    }

    public void m(@androidx.annotation.p0 Comparator<androidx.media3.common.w> comparator) {
        this.f69885l = comparator;
    }

    public h1 n(@androidx.annotation.p0 e1 e1Var) {
        this.f69882i = e1Var;
        return this;
    }

    public h1(Context context, CharSequence charSequence, final androidx.media3.common.z0 z0Var, final int i10) {
        this.f69874a = context;
        this.f69875b = charSequence;
        l6<i4.a> l6VarC = (z0Var.P0(30) ? z0Var.M0() : i4.f60639b).c();
        this.f69876c = new ArrayList();
        for (int i11 = 0; i11 < l6VarC.size(); i11++) {
            i4.a aVar = l6VarC.get(i11);
            if (aVar.f() == i10) {
                this.f69876c.add(aVar);
            }
        }
        this.f69884k = z0Var.V0().D;
        this.f69877d = new a() { // from class: androidx.media3.ui.g1
            @Override // androidx.media3.ui.h1.a
            public final void a(boolean z10, Map map) {
                h1.a(z0Var, i10, z10, map);
            }
        };
    }
}
