package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.view.u1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final int f72923x3 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final String f72924y3 = "Preference";
    private boolean H1;
    private boolean X;
    private boolean Y;
    private String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f72925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private s f72926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private i f72927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f72928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f72929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f72930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f72931g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f72932g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f72933h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f72934h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f72935i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f72936i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f72937j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private boolean f72938j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f72939k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f72940k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f72941l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f72942l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f72943m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f72944m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f72945n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private int f72946n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Intent f72947o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private int f72948o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Object f72949p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f72950p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f72951p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private b f72952p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private List<Preference> f72953q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private PreferenceGroup f72954r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f72955s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private boolean f72956s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bundle f72957t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f72958t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private e f72959u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f72960v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private f f72961v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f72962w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private final View.OnClickListener f72963w3;

    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        class a implements Parcelable.Creator<BaseSavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public BaseSavedState[] newArray(int i10) {
                return new BaseSavedState[i10];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.I0(view);
        }
    }

    interface b {
        void b(@NonNull Preference preference);

        void d(@NonNull Preference preference);

        void f(@NonNull Preference preference);
    }

    public interface c {
        boolean a(@NonNull Preference preference, Object obj);
    }

    public interface d {
        boolean a(@NonNull Preference preference);
    }

    private static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Preference f72965a;

        e(@NonNull Preference preference) {
            this.f72965a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceA0 = this.f72965a.a0();
            if (!this.f72965a.g0() || TextUtils.isEmpty(charSequenceA0)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceA0);
            contextMenu.add(0, 0, 0, v.i.f73239a).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f72965a.r().getSystemService("clipboard");
            CharSequence charSequenceA0 = this.f72965a.a0();
            clipboardManager.setPrimaryClip(ClipData.newPlainText(Preference.f72924y3, charSequenceA0));
            Toast.makeText(this.f72965a.r(), this.f72965a.r().getString(v.i.f73242d, charSequenceA0), 0).show();
            return true;
        }
    }

    public interface f<T extends Preference> {
        @p0
        CharSequence a(@NonNull T t10);
    }

    public Preference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        this.f72933h = Integer.MAX_VALUE;
        this.f72935i = 0;
        this.f72960v = true;
        this.f72962w = true;
        this.Y = true;
        this.f72950p1 = true;
        this.H1 = true;
        this.f72951p2 = true;
        this.f72932g3 = true;
        this.f72934h3 = true;
        this.f72938j3 = true;
        this.f72944m3 = true;
        this.f72946n3 = v.h.f73223c;
        this.f72963w3 = new a();
        this.f72925a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.K, i10, i11);
        this.f72941l = androidx.core.content.res.n.n(typedArrayObtainStyledAttributes, v.k.f73297i0, v.k.L, 0);
        this.f72945n = androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73306l0, v.k.R);
        this.f72937j = androidx.core.content.res.n.p(typedArrayObtainStyledAttributes, v.k.f73330t0, v.k.P);
        this.f72939k = androidx.core.content.res.n.p(typedArrayObtainStyledAttributes, v.k.f73327s0, v.k.S);
        this.f72933h = androidx.core.content.res.n.d(typedArrayObtainStyledAttributes, v.k.f73312n0, v.k.T, Integer.MAX_VALUE);
        this.f72955s = androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73294h0, v.k.Y);
        this.f72946n3 = androidx.core.content.res.n.n(typedArrayObtainStyledAttributes, v.k.f73309m0, v.k.O, v.h.f73223c);
        this.f72948o3 = androidx.core.content.res.n.n(typedArrayObtainStyledAttributes, v.k.f73333u0, v.k.U, 0);
        this.f72960v = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, v.k.f73291g0, v.k.N, true);
        this.f72962w = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, v.k.f73318p0, v.k.Q, true);
        this.Y = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, v.k.f73315o0, v.k.M, true);
        this.Z = androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73285e0, v.k.V);
        int i12 = v.k.f73276b0;
        this.f72932g3 = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, i12, i12, this.f72962w);
        int i13 = v.k.f73279c0;
        this.f72934h3 = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, i13, i13, this.f72962w);
        if (typedArrayObtainStyledAttributes.hasValue(v.k.f73282d0)) {
            this.f72949p0 = y0(typedArrayObtainStyledAttributes, v.k.f73282d0);
        } else if (typedArrayObtainStyledAttributes.hasValue(v.k.W)) {
            this.f72949p0 = y0(typedArrayObtainStyledAttributes, v.k.W);
        }
        this.f72944m3 = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, v.k.f73321q0, v.k.X, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(v.k.f73324r0);
        this.f72936i3 = zHasValue;
        if (zHasValue) {
            this.f72938j3 = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, v.k.f73324r0, v.k.Z, true);
        }
        this.f72940k3 = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, v.k.f73300j0, v.k.f73273a0, false);
        int i14 = v.k.f73303k0;
        this.f72951p2 = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, i14, i14, true);
        int i15 = v.k.f73288f0;
        this.f72942l3 = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, i15, i15, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void A1() {
        Preference preferenceQ;
        String str = this.Z;
        if (str == null || (preferenceQ = q(str)) == null) {
            return;
        }
        preferenceQ.B1(this);
    }

    private void B1(Preference preference) {
        List<Preference> list = this.f72953q3;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void P0() {
        if (TextUtils.isEmpty(this.Z)) {
            return;
        }
        Preference preferenceQ = q(this.Z);
        if (preferenceQ != null) {
            preferenceQ.Q0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.Z + "\" not found for preference \"" + this.f72945n + "\" (title: \"" + ((Object) this.f72937j) + "\"");
    }

    private void Q0(Preference preference) {
        if (this.f72953q3 == null) {
            this.f72953q3 = new ArrayList();
        }
        this.f72953q3.add(preference);
        preference.w0(this, x1());
    }

    private void Y0(@NonNull View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                Y0(viewGroup.getChildAt(childCount), z10);
            }
        }
    }

    private void p() {
        if (W() != null) {
            F0(true, this.f72949p0);
            return;
        }
        if (y1() && Y().contains(this.f72945n)) {
            F0(true, null);
            return;
        }
        Object obj = this.f72949p0;
        if (obj != null) {
            F0(false, obj);
        }
    }

    private void z1(@NonNull SharedPreferences.Editor editor) {
        if (this.f72926b.H()) {
            editor.apply();
        }
    }

    public void A0(@NonNull Preference preference, boolean z10) {
        if (this.H1 == z10) {
            this.H1 = !z10;
            p0(x1());
            o0();
        }
    }

    protected void B0() {
        A1();
    }

    protected void C0(@p0 Parcelable parcelable) {
        this.f72958t3 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    final boolean C1() {
        return this.f72956s3;
    }

    @p0
    public Intent D() {
        return this.f72947o;
    }

    @p0
    protected Parcelable D0() {
        this.f72958t3 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public String E() {
        return this.f72945n;
    }

    protected void E0(@p0 Object obj) {
    }

    @Deprecated
    protected void F0(boolean z10, Object obj) {
        E0(obj);
    }

    @p0
    public Bundle G0() {
        return this.f72957t;
    }

    public final int H() {
        return this.f72946n3;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void H0() {
        s.c cVarK;
        if (h0() && k0()) {
            v0();
            d dVar = this.f72931g;
            if (dVar == null || !dVar.a(this)) {
                s sVarX = X();
                if ((sVarX == null || (cVarK = sVarX.k()) == null || !cVarK.i(this)) && this.f72947o != null) {
                    r().startActivity(this.f72947o);
                }
            }
        }
    }

    @p0
    public c I() {
        return this.f72930f;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    protected void I0(@NonNull View view) {
        H0();
    }

    protected boolean J0(boolean z10) {
        if (!y1()) {
            return false;
        }
        if (z10 == O(!z10)) {
            return true;
        }
        i iVarW = W();
        if (iVarW != null) {
            iVarW.g(this.f72945n, z10);
        } else {
            SharedPreferences.Editor editorG = this.f72926b.g();
            editorG.putBoolean(this.f72945n, z10);
            z1(editorG);
        }
        return true;
    }

    protected boolean K0(float f10) {
        if (!y1()) {
            return false;
        }
        if (f10 == R(Float.NaN)) {
            return true;
        }
        i iVarW = W();
        if (iVarW != null) {
            iVarW.h(this.f72945n, f10);
        } else {
            SharedPreferences.Editor editorG = this.f72926b.g();
            editorG.putFloat(this.f72945n, f10);
            z1(editorG);
        }
        return true;
    }

    @p0
    public d L() {
        return this.f72931g;
    }

    protected boolean L0(int i10) {
        if (!y1()) {
            return false;
        }
        if (i10 == S(~i10)) {
            return true;
        }
        i iVarW = W();
        if (iVarW != null) {
            iVarW.i(this.f72945n, i10);
        } else {
            SharedPreferences.Editor editorG = this.f72926b.g();
            editorG.putInt(this.f72945n, i10);
            z1(editorG);
        }
        return true;
    }

    public int M() {
        return this.f72933h;
    }

    protected boolean M0(long j10) {
        if (!y1()) {
            return false;
        }
        if (j10 == T(~j10)) {
            return true;
        }
        i iVarW = W();
        if (iVarW != null) {
            iVarW.j(this.f72945n, j10);
        } else {
            SharedPreferences.Editor editorG = this.f72926b.g();
            editorG.putLong(this.f72945n, j10);
            z1(editorG);
        }
        return true;
    }

    @p0
    public PreferenceGroup N() {
        return this.f72954r3;
    }

    protected boolean N0(String str) {
        if (!y1()) {
            return false;
        }
        if (TextUtils.equals(str, U(null))) {
            return true;
        }
        i iVarW = W();
        if (iVarW != null) {
            iVarW.k(this.f72945n, str);
        } else {
            SharedPreferences.Editor editorG = this.f72926b.g();
            editorG.putString(this.f72945n, str);
            z1(editorG);
        }
        return true;
    }

    protected boolean O(boolean z10) {
        if (!y1()) {
            return z10;
        }
        i iVarW = W();
        return iVarW != null ? iVarW.a(this.f72945n, z10) : this.f72926b.o().getBoolean(this.f72945n, z10);
    }

    public boolean O0(Set<String> set) {
        if (!y1()) {
            return false;
        }
        if (set.equals(V(null))) {
            return true;
        }
        i iVarW = W();
        if (iVarW != null) {
            iVarW.l(this.f72945n, set);
        } else {
            SharedPreferences.Editor editorG = this.f72926b.g();
            editorG.putStringSet(this.f72945n, set);
            z1(editorG);
        }
        return true;
    }

    protected float R(float f10) {
        if (!y1()) {
            return f10;
        }
        i iVarW = W();
        return iVarW != null ? iVarW.b(this.f72945n, f10) : this.f72926b.o().getFloat(this.f72945n, f10);
    }

    void R0() {
        if (TextUtils.isEmpty(this.f72945n)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.X = true;
    }

    protected int S(int i10) {
        if (!y1()) {
            return i10;
        }
        i iVarW = W();
        return iVarW != null ? iVarW.c(this.f72945n, i10) : this.f72926b.o().getInt(this.f72945n, i10);
    }

    public void S0(@NonNull Bundle bundle) {
        n(bundle);
    }

    protected long T(long j10) {
        if (!y1()) {
            return j10;
        }
        i iVarW = W();
        return iVarW != null ? iVarW.d(this.f72945n, j10) : this.f72926b.o().getLong(this.f72945n, j10);
    }

    public void T0(@NonNull Bundle bundle) {
        o(bundle);
    }

    protected String U(String str) {
        if (!y1()) {
            return str;
        }
        i iVarW = W();
        return iVarW != null ? iVarW.e(this.f72945n, str) : this.f72926b.o().getString(this.f72945n, str);
    }

    public void U0(boolean z10) {
        if (this.f72942l3 != z10) {
            this.f72942l3 = z10;
            o0();
        }
    }

    public Set<String> V(Set<String> set) {
        if (!y1()) {
            return set;
        }
        i iVarW = W();
        return iVarW != null ? iVarW.f(this.f72945n, set) : this.f72926b.o().getStringSet(this.f72945n, set);
    }

    public void V0(Object obj) {
        this.f72949p0 = obj;
    }

    @p0
    public i W() {
        i iVar = this.f72927c;
        if (iVar != null) {
            return iVar;
        }
        s sVar = this.f72926b;
        if (sVar != null) {
            return sVar.m();
        }
        return null;
    }

    public void W0(@p0 String str) {
        A1();
        this.Z = str;
        P0();
    }

    public s X() {
        return this.f72926b;
    }

    public void X0(boolean z10) {
        if (this.f72960v != z10) {
            this.f72960v = z10;
            p0(x1());
            o0();
        }
    }

    @p0
    public SharedPreferences Y() {
        if (this.f72926b == null || W() != null) {
            return null;
        }
        return this.f72926b.o();
    }

    public boolean Z() {
        return this.f72944m3;
    }

    public void Z0(@p0 String str) {
        this.f72955s = str;
    }

    @p0
    public CharSequence a0() {
        return c0() != null ? c0().a(this) : this.f72939k;
    }

    public void a1(int i10) {
        b1(j.a.b(this.f72925a, i10));
        this.f72941l = i10;
    }

    void b(@p0 PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.f72954r3 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f72954r3 = preferenceGroup;
    }

    public void b1(@p0 Drawable drawable) {
        if (this.f72943m != drawable) {
            this.f72943m = drawable;
            this.f72941l = 0;
            o0();
        }
    }

    public boolean c(Object obj) {
        c cVar = this.f72930f;
        return cVar == null || cVar.a(this, obj);
    }

    @p0
    public final f c0() {
        return this.f72961v3;
    }

    public void c1(boolean z10) {
        if (this.f72940k3 != z10) {
            this.f72940k3 = z10;
            o0();
        }
    }

    @p0
    public CharSequence d0() {
        return this.f72937j;
    }

    public void d1(@p0 Intent intent) {
        this.f72947o = intent;
    }

    public final int e0() {
        return this.f72948o3;
    }

    public void e1(String str) {
        this.f72945n = str;
        if (!this.X || f0()) {
            return;
        }
        R0();
    }

    public boolean f0() {
        return !TextUtils.isEmpty(this.f72945n);
    }

    public void f1(int i10) {
        this.f72946n3 = i10;
    }

    public boolean g0() {
        return this.f72942l3;
    }

    final void g1(@p0 b bVar) {
        this.f72952p3 = bVar;
    }

    public boolean h0() {
        return this.f72960v && this.f72950p1 && this.H1;
    }

    public void h1(@p0 c cVar) {
        this.f72930f = cVar;
    }

    public boolean i0() {
        return this.f72940k3;
    }

    public void i1(@p0 d dVar) {
        this.f72931g = dVar;
    }

    public boolean j0() {
        return this.Y;
    }

    public void j1(int i10) {
        if (i10 != this.f72933h) {
            this.f72933h = i10;
            q0();
        }
    }

    final void k() {
        this.f72956s3 = false;
    }

    public boolean k0() {
        return this.f72962w;
    }

    public void k1(boolean z10) {
        this.Y = z10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Preference preference) {
        int i10 = this.f72933h;
        int i11 = preference.f72933h;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f72937j;
        CharSequence charSequence2 = preference.f72937j;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f72937j.toString());
    }

    public final boolean l0() {
        if (n0() && X() != null) {
            if (this == X().n()) {
                return true;
            }
            PreferenceGroup preferenceGroupN = N();
            if (preferenceGroupN == null) {
                return false;
            }
            return preferenceGroupN.l0();
        }
        return false;
    }

    public void l1(@p0 i iVar) {
        this.f72927c = iVar;
    }

    public boolean m0() {
        return this.f72938j3;
    }

    public void m1(boolean z10) {
        if (this.f72962w != z10) {
            this.f72962w = z10;
            o0();
        }
    }

    void n(@NonNull Bundle bundle) {
        Parcelable parcelable;
        if (!f0() || (parcelable = bundle.getParcelable(this.f72945n)) == null) {
            return;
        }
        this.f72958t3 = false;
        C0(parcelable);
        if (!this.f72958t3) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public final boolean n0() {
        return this.f72951p2;
    }

    public void n1(boolean z10) {
        if (this.f72944m3 != z10) {
            this.f72944m3 = z10;
            o0();
        }
    }

    void o(@NonNull Bundle bundle) {
        if (f0()) {
            this.f72958t3 = false;
            Parcelable parcelableD0 = D0();
            if (!this.f72958t3) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableD0 != null) {
                bundle.putParcelable(this.f72945n, parcelableD0);
            }
        }
    }

    protected void o0() {
        b bVar = this.f72952p3;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public void o1(boolean z10) {
        this.f72936i3 = true;
        this.f72938j3 = z10;
    }

    public void p0(boolean z10) {
        List<Preference> list = this.f72953q3;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).w0(this, z10);
        }
    }

    public void p1(int i10) {
        q1(this.f72925a.getString(i10));
    }

    @p0
    protected <T extends Preference> T q(@NonNull String str) {
        s sVar = this.f72926b;
        if (sVar == null) {
            return null;
        }
        return (T) sVar.b(str);
    }

    protected void q0() {
        b bVar = this.f72952p3;
        if (bVar != null) {
            bVar.f(this);
        }
    }

    public void q1(@p0 CharSequence charSequence) {
        if (c0() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f72939k, charSequence)) {
            return;
        }
        this.f72939k = charSequence;
        o0();
    }

    @NonNull
    public Context r() {
        return this.f72925a;
    }

    public void r0() {
        P0();
    }

    public final void r1(@p0 f fVar) {
        this.f72961v3 = fVar;
        o0();
    }

    @p0
    public String s() {
        return this.Z;
    }

    protected void s0(@NonNull s sVar) {
        this.f72926b = sVar;
        if (!this.f72929e) {
            this.f72928d = sVar.h();
        }
        p();
    }

    public void s1(int i10) {
        t1(this.f72925a.getString(i10));
    }

    @NonNull
    public Bundle t() {
        if (this.f72957t == null) {
            this.f72957t = new Bundle();
        }
        return this.f72957t;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    protected void t0(@NonNull s sVar, long j10) {
        this.f72928d = j10;
        this.f72929e = true;
        try {
            s0(sVar);
        } finally {
            this.f72929e = false;
        }
    }

    public void t1(@p0 CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f72937j)) {
            this.f72937j = charSequence;
            o0();
        }
    }

    @NonNull
    public String toString() {
        return v().toString();
    }

    public void u0(@NonNull u uVar) {
        Integer numValueOf;
        View view = uVar.itemView;
        view.setOnClickListener(this.f72963w3);
        view.setId(this.f72935i);
        TextView textView = (TextView) uVar.h(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceA0 = a0();
            if (TextUtils.isEmpty(charSequenceA0)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceA0);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) uVar.h(R.id.title);
        if (textView2 != null) {
            CharSequence charSequenceD0 = d0();
            if (TextUtils.isEmpty(charSequenceD0)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequenceD0);
                textView2.setVisibility(0);
                if (this.f72936i3) {
                    textView2.setSingleLine(this.f72938j3);
                }
                if (!k0() && h0() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) uVar.h(R.id.icon);
        if (imageView != null) {
            int i10 = this.f72941l;
            if (i10 != 0 || this.f72943m != null) {
                if (this.f72943m == null) {
                    this.f72943m = j.a.b(this.f72925a, i10);
                }
                Drawable drawable = this.f72943m;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f72943m != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.f72940k3 ? 4 : 8);
            }
        }
        View viewH = uVar.h(v.f.f73210a);
        if (viewH == null) {
            viewH = uVar.h(16908350);
        }
        if (viewH != null) {
            if (this.f72943m != null) {
                viewH.setVisibility(0);
            } else {
                viewH.setVisibility(this.f72940k3 ? 4 : 8);
            }
        }
        if (this.f72944m3) {
            Y0(view, h0());
        } else {
            Y0(view, true);
        }
        boolean zK0 = k0();
        view.setFocusable(zK0);
        view.setClickable(zK0);
        uVar.l(this.f72932g3);
        uVar.m(this.f72934h3);
        boolean zG0 = g0();
        if (zG0 && this.f72959u3 == null) {
            this.f72959u3 = new e(this);
        }
        view.setOnCreateContextMenuListener(zG0 ? this.f72959u3 : null);
        view.setLongClickable(zG0);
        if (!zG0 || zK0) {
            return;
        }
        u1.O1(view, null);
    }

    public void u1(int i10) {
        this.f72935i = i10;
    }

    @NonNull
    StringBuilder v() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequenceD0 = d0();
        if (!TextUtils.isEmpty(charSequenceD0)) {
            sb2.append(charSequenceD0);
            sb2.append(' ');
        }
        CharSequence charSequenceA0 = a0();
        if (!TextUtils.isEmpty(charSequenceA0)) {
            sb2.append(charSequenceA0);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    protected void v0() {
    }

    public final void v1(boolean z10) {
        if (this.f72951p2 != z10) {
            this.f72951p2 = z10;
            b bVar = this.f72952p3;
            if (bVar != null) {
                bVar.b(this);
            }
        }
    }

    @p0
    public String w() {
        return this.f72955s;
    }

    public void w0(@NonNull Preference preference, boolean z10) {
        if (this.f72950p1 == z10) {
            this.f72950p1 = !z10;
            p0(x1());
            o0();
        }
    }

    public void w1(int i10) {
        this.f72948o3 = i10;
    }

    @p0
    public Drawable x() {
        int i10;
        if (this.f72943m == null && (i10 = this.f72941l) != 0) {
            this.f72943m = j.a.b(this.f72925a, i10);
        }
        return this.f72943m;
    }

    public void x0() {
        A1();
        this.f72956s3 = true;
    }

    public boolean x1() {
        return !h0();
    }

    @p0
    protected Object y0(@NonNull TypedArray typedArray, int i10) {
        return null;
    }

    protected boolean y1() {
        return this.f72926b != null && j0() && f0();
    }

    long z() {
        return this.f72928d;
    }

    @androidx.annotation.i
    @Deprecated
    public void z0(androidx.core.view.accessibility.j jVar) {
    }

    public Preference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, v.a.Q, R.attr.preferenceStyle));
    }

    public Preference(@NonNull Context context) {
        this(context, null);
    }
}
