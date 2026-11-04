package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.h3;
import androidx.lifecycle.m2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<?> f52015a;

    private v(x<?> xVar) {
        this.f52015a = xVar;
    }

    @NonNull
    public static v b(@NonNull x<?> xVar) {
        return new v((x) androidx.core.util.t.m(xVar, "callbacks == null"));
    }

    @androidx.annotation.p0
    public Fragment A(@NonNull String str) {
        return this.f52015a.g().x0(str);
    }

    @NonNull
    public List<Fragment> B(@e.a({"UnknownNullness"}) List<Fragment> list) {
        return this.f52015a.g().E0();
    }

    public int C() {
        return this.f52015a.g().D0();
    }

    @NonNull
    public FragmentManager D() {
        return this.f52015a.g();
    }

    @e.a({"UnknownNullness"})
    @Deprecated
    public androidx.loader.app.a E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.f52015a.g().n1();
    }

    @androidx.annotation.p0
    public View G(@androidx.annotation.p0 View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f52015a.g().P0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 k0 k0Var) {
        this.f52015a.g().K1(parcelable, k0Var);
    }

    @Deprecated
    public void J(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 List<Fragment> list) {
        this.f52015a.g().K1(parcelable, new k0(list, null, null));
    }

    @Deprecated
    public void K(@e.a({"UnknownNullness"}) h3<String, androidx.loader.app.a> h3Var) {
    }

    @Deprecated
    public void L(@androidx.annotation.p0 Parcelable parcelable) {
        x<?> xVar = this.f52015a;
        if (!(xVar instanceof m2)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        xVar.g().N1(parcelable);
    }

    @androidx.annotation.p0
    @Deprecated
    public h3<String, androidx.loader.app.a> M() {
        return null;
    }

    @androidx.annotation.p0
    @Deprecated
    public k0 N() {
        return this.f52015a.g().P1();
    }

    @androidx.annotation.p0
    @Deprecated
    public List<Fragment> O() {
        k0 k0VarP1 = this.f52015a.g().P1();
        if (k0VarP1 == null || k0VarP1.b() == null) {
            return null;
        }
        return new ArrayList(k0VarP1.b());
    }

    @androidx.annotation.p0
    @Deprecated
    public Parcelable P() {
        return this.f52015a.g().R1();
    }

    public void a(@androidx.annotation.p0 Fragment fragment) {
        FragmentManager fragmentManagerG = this.f52015a.g();
        x<?> xVar = this.f52015a;
        fragmentManagerG.u(xVar, xVar, fragment);
    }

    public void c() {
        this.f52015a.g().I();
    }

    @Deprecated
    public void d(@NonNull Configuration configuration) {
        this.f52015a.g().K(configuration, true);
    }

    public boolean e(@NonNull MenuItem menuItem) {
        return this.f52015a.g().L(menuItem);
    }

    public void f() {
        this.f52015a.g().M();
    }

    @Deprecated
    public boolean g(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        return this.f52015a.g().N(menu, menuInflater);
    }

    public void h() {
        this.f52015a.g().O();
    }

    public void i() {
        this.f52015a.g().P();
    }

    @Deprecated
    public void j() {
        this.f52015a.g().Q(true);
    }

    @Deprecated
    public void k(boolean z10) {
        this.f52015a.g().R(z10, true);
    }

    @Deprecated
    public boolean l(@NonNull MenuItem menuItem) {
        return this.f52015a.g().U(menuItem);
    }

    @Deprecated
    public void m(@NonNull Menu menu) {
        this.f52015a.g().V(menu);
    }

    public void n() {
        this.f52015a.g().X();
    }

    @Deprecated
    public void o(boolean z10) {
        this.f52015a.g().Y(z10, true);
    }

    @Deprecated
    public boolean p(@NonNull Menu menu) {
        return this.f52015a.g().Z(menu);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.f52015a.g().b0();
    }

    public void s() {
        this.f52015a.g().c0();
    }

    public void t() {
        this.f52015a.g().e0();
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void x(boolean z10) {
    }

    @Deprecated
    public void y(@NonNull String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
    }

    public boolean z() {
        return this.f52015a.g().n0(true);
    }
}
