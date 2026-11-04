package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.b1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public abstract class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f10626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f10627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected g f10628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LayoutInflater f10629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f10630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n.a f10631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected o f10634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10635j;

    public b(Context context, int i10, int i11) {
        this.f10626a = context;
        this.f10629d = LayoutInflater.from(context);
        this.f10632g = i10;
        this.f10633h = i11;
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z10) {
        n.a aVar = this.f10631f;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean c(g gVar, j jVar) {
        return false;
    }

    protected void d(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f10634i).addView(view, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.n
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f10634i;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f10628c;
        int i10 = 0;
        if (gVar != null) {
            gVar.u();
            ArrayList<j> arrayListH = this.f10628c.H();
            int size = arrayListH.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                j jVar = arrayListH.get(i12);
                if (t(i11, jVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    j itemData = childAt instanceof o.a ? ((o.a) childAt).getItemData() : null;
                    View viewR = r(jVar, childAt, viewGroup);
                    if (jVar != itemData) {
                        viewR.setPressed(false);
                        viewR.jumpDrawablesToCurrentState();
                    }
                    if (viewR != childAt) {
                        d(viewR, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!p(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f10635j;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean h(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(Context context, g gVar) {
        this.f10627b = context;
        this.f10630e = LayoutInflater.from(context);
        this.f10628c = gVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(n.a aVar) {
        this.f10631f = aVar;
    }

    public abstract void k(j jVar, o.a aVar);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.n
    public boolean m(s sVar) {
        n.a aVar = this.f10631f;
        g gVar = sVar;
        if (aVar == null) {
            return false;
        }
        if (sVar == null) {
            gVar = this.f10628c;
        }
        return aVar.c(gVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public o n(ViewGroup viewGroup) {
        if (this.f10634i == null) {
            o oVar = (o) this.f10629d.inflate(this.f10632g, viewGroup, false);
            this.f10634i = oVar;
            oVar.a(this.f10628c);
            f(true);
        }
        return this.f10634i;
    }

    public o.a o(ViewGroup viewGroup) {
        return (o.a) this.f10629d.inflate(this.f10633h, viewGroup, false);
    }

    protected boolean p(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public n.a q() {
        return this.f10631f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View r(j jVar, View view, ViewGroup viewGroup) {
        o.a aVarO = view instanceof o.a ? (o.a) view : o(viewGroup);
        k(jVar, aVarO);
        return (View) aVarO;
    }

    public void s(int i10) {
        this.f10635j = i10;
    }

    public boolean t(int i10, j jVar) {
        return true;
    }
}
