package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.core.view.y1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class g implements l1.a {
    private static final String L = "MenuBuilder";
    private static final String M = "android:menu:presenters";
    private static final String N = "android:menu:actionviewstates";
    private static final String O = "android:menu:expandedactionview";
    private static final int[] P = {1, 4, 5, 3, 2, 0};
    View A;
    private j I;
    private boolean K;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Context f10695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Resources f10696m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10697n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10698o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f10699p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f10707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    CharSequence f10708y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    Drawable f10709z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f10706w = 0;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private ArrayList<j> G = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<n>> H = new CopyOnWriteArrayList<>();
    private boolean J = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<j> f10700q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<j> f10701r = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10702s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<j> f10703t = new ArrayList<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList<j> f10704u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10705v = true;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a(@NonNull g gVar, @NonNull MenuItem menuItem);

        void b(@NonNull g gVar);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public interface b {
        boolean b(j jVar);
    }

    public g(Context context) {
        this.f10695l = context;
        this.f10696m = context.getResources();
        l0(true);
    }

    private static int E(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = P;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void S(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f10700q.size()) {
            this.f10700q.remove(i10);
            if (z10) {
                O(true);
            }
        }
    }

    private void e0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesF = F();
        if (view != null) {
            this.A = view;
            this.f10708y = null;
            this.f10709z = null;
        } else {
            if (i10 > 0) {
                this.f10708y = resourcesF.getText(i10);
            } else if (charSequence != null) {
                this.f10708y = charSequence;
            }
            if (i11 > 0) {
                this.f10709z = androidx.core.content.d.l(x(), i11);
            } else if (drawable != null) {
                this.f10709z = drawable;
            }
            this.A = null;
        }
        O(false);
    }

    private j h(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new j(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void j(boolean z10) {
        if (this.H.isEmpty()) {
            return;
        }
        n0();
        for (WeakReference<n> weakReference : this.H) {
            n nVar = weakReference.get();
            if (nVar == null) {
                this.H.remove(weakReference);
            } else {
                nVar.f(z10);
            }
        }
        m0();
    }

    private void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(M);
        if (sparseParcelableArray != null && !this.H.isEmpty()) {
            for (WeakReference<n> weakReference : this.H) {
                n nVar = weakReference.get();
                if (nVar == null) {
                    this.H.remove(weakReference);
                } else {
                    int id2 = nVar.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        nVar.l(parcelable);
                    }
                }
            }
        }
    }

    private void l(Bundle bundle) {
        Parcelable parcelableE;
        if (this.H.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<n> weakReference : this.H) {
            n nVar = weakReference.get();
            if (nVar == null) {
                this.H.remove(weakReference);
            } else {
                int id2 = nVar.getId();
                if (id2 > 0 && (parcelableE = nVar.e()) != null) {
                    sparseArray.put(id2, parcelableE);
                }
            }
        }
        bundle.putSparseParcelableArray(M, sparseArray);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    private void l0(boolean z10) {
        boolean z11;
        if (z10) {
            z11 = this.f10696m.getConfiguration().keyboard != 1 && y1.n(ViewConfiguration.get(this.f10695l), this.f10695l);
        }
        this.f10698o = z11;
    }

    private boolean m(s sVar, n nVar) {
        if (this.H.isEmpty()) {
            return false;
        }
        boolean zM = nVar != null ? nVar.m(sVar) : false;
        for (WeakReference<n> weakReference : this.H) {
            n nVar2 = weakReference.get();
            if (nVar2 == null) {
                this.H.remove(weakReference);
            } else if (!zM) {
                zM = nVar2.m(sVar);
            }
        }
        return zM;
    }

    private static int q(ArrayList<j> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.f10708y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList<j> C() {
        u();
        return this.f10704u;
    }

    boolean D() {
        return this.E;
    }

    Resources F() {
        return this.f10696m;
    }

    public g G() {
        return this;
    }

    @NonNull
    public ArrayList<j> H() {
        if (!this.f10702s) {
            return this.f10701r;
        }
        this.f10701r.clear();
        int size = this.f10700q.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = this.f10700q.get(i10);
            if (jVar.isVisible()) {
                this.f10701r.add(jVar);
            }
        }
        this.f10702s = false;
        this.f10705v = true;
        return this.f10701r;
    }

    public boolean I() {
        return !this.B;
    }

    public boolean J() {
        return this.J;
    }

    boolean K() {
        return this.f10697n;
    }

    public boolean L() {
        return this.f10698o;
    }

    void M(j jVar) {
        this.f10705v = true;
        O(true);
    }

    void N(j jVar) {
        this.f10702s = true;
        O(true);
    }

    public void O(boolean z10) {
        if (this.B) {
            this.C = true;
            if (z10) {
                this.D = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f10702s = true;
            this.f10705v = true;
        }
        j(z10);
    }

    public boolean P(MenuItem menuItem, int i10) {
        return Q(menuItem, null, i10);
    }

    public boolean Q(MenuItem menuItem, n nVar, int i10) {
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean zN = jVar.n();
        androidx.core.view.b bVarA = jVar.a();
        boolean z10 = bVarA != null && bVarA.b();
        if (jVar.m()) {
            boolean zExpandActionView = jVar.expandActionView() | zN;
            if (zExpandActionView) {
                f(true);
            }
            return zExpandActionView;
        }
        if (!jVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                f(true);
            }
            return zN;
        }
        if ((i10 & 4) == 0) {
            f(false);
        }
        if (!jVar.hasSubMenu()) {
            jVar.A(new s(x(), this, jVar));
        }
        s sVar = (s) jVar.getSubMenu();
        if (z10) {
            bVarA.g(sVar);
        }
        boolean zM = m(sVar, nVar) | zN;
        if (!zM) {
            f(true);
        }
        return zM;
    }

    public void R(int i10) {
        S(i10, true);
    }

    public void T(n nVar) {
        for (WeakReference<n> weakReference : this.H) {
            n nVar2 = weakReference.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.H.remove(weakReference);
            }
        }
    }

    public void U(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(w());
        int size = size();
        int i10 = 5 | 0;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).U(bundle);
            }
        }
        int i12 = bundle.getInt(O);
        if (i12 <= 0 || (menuItemFindItem = findItem(i12)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(O, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).W(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void X(Bundle bundle) {
        l(bundle);
    }

    public void Y(a aVar) {
        this.f10699p = aVar;
    }

    public void Z(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f10707x = contextMenuInfo;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iE = E(i12);
        j jVarH = h(i10, i11, i12, iE, charSequence, this.f10706w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f10707x;
        if (contextMenuInfo != null) {
            jVarH.y(contextMenuInfo);
        }
        ArrayList<j> arrayList = this.f10700q;
        arrayList.add(q(arrayList, iE), jVarH);
        O(true);
        return jVarH;
    }

    public g a0(int i10) {
        this.f10706w = i10;
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f10695l.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(n nVar) {
        c(nVar, this.f10695l);
    }

    void b0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f10700q.size();
        n0();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = this.f10700q.get(i10);
            if (jVar.getGroupId() == groupId && jVar.p() && jVar.isCheckable()) {
                jVar.v(jVar == menuItem);
            }
        }
        m0();
    }

    public void c(n nVar, Context context) {
        this.H.add(new WeakReference<>(nVar));
        nVar.i(context, this);
        this.f10705v = true;
    }

    protected g c0(int i10) {
        e0(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        j jVar = this.I;
        if (jVar != null) {
            g(jVar);
        }
        this.f10700q.clear();
        O(true);
    }

    public void clearHeader() {
        this.f10709z = null;
        this.f10708y = null;
        this.A = null;
        O(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.f10699p;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    protected g d0(Drawable drawable) {
        e0(0, null, 0, drawable, null);
        return this;
    }

    public void e() {
        this.B = true;
        clear();
        clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        O(true);
    }

    public final void f(boolean z10) {
        if (this.F) {
            return;
        }
        this.F = true;
        for (WeakReference<n> weakReference : this.H) {
            n nVar = weakReference.get();
            if (nVar == null) {
                this.H.remove(weakReference);
            } else {
                nVar.b(this, z10);
            }
        }
        this.F = false;
    }

    protected g f0(int i10) {
        e0(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f10700q.get(i11);
            if (jVar.getItemId() == i10) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (menuItemFindItem = jVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(j jVar) {
        boolean zH = false;
        if (!this.H.isEmpty() && this.I == jVar) {
            n0();
            for (WeakReference<n> weakReference : this.H) {
                n nVar = weakReference.get();
                if (nVar != null) {
                    zH = nVar.h(this, jVar);
                    if (zH) {
                        break;
                    }
                } else {
                    this.H.remove(weakReference);
                }
            }
            m0();
            if (zH) {
                this.I = null;
            }
        }
        return zH;
    }

    protected g g0(CharSequence charSequence) {
        e0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f10700q.get(i10);
    }

    protected g h0(View view) {
        e0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10700q.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    boolean i(@NonNull g gVar, @NonNull MenuItem menuItem) {
        a aVar = this.f10699p;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public void i0(boolean z10) {
        this.E = z10;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return s(i10, keyEvent) != null;
    }

    public void j0(boolean z10) {
        this.K = z10;
    }

    public void k0(boolean z10) {
        if (this.f10698o == z10) {
            return;
        }
        l0(z10);
        O(false);
    }

    public void m0() {
        this.B = false;
        if (this.C) {
            this.C = false;
            O(this.D);
        }
    }

    public boolean n(j jVar) {
        boolean zC = false;
        if (this.H.isEmpty()) {
            return false;
        }
        n0();
        for (WeakReference<n> weakReference : this.H) {
            n nVar = weakReference.get();
            if (nVar != null) {
                zC = nVar.c(this, jVar);
                if (zC) {
                    break;
                }
            } else {
                this.H.remove(weakReference);
            }
        }
        m0();
        if (zC) {
            this.I = jVar;
        }
        return zC;
    }

    public void n0() {
        if (!this.B) {
            this.B = true;
            this.C = false;
            this.D = false;
        }
    }

    public int o(int i10) {
        return p(i10, 0);
    }

    public int p(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f10700q.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return P(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        j jVarS = s(i10, keyEvent);
        boolean zP = jVarS != null ? P(jVarS, i11) : false;
        if ((i11 & 2) != 0) {
            f(true);
        }
        return zP;
    }

    public int r(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f10700q.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iO = o(i10);
        if (iO >= 0) {
            int size = this.f10700q.size() - iO;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f10700q.get(iO).getGroupId() != i10) {
                    break;
                }
                S(iO, false);
                i11 = i12;
            }
            O(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        S(r(i10), true);
    }

    j s(int i10, KeyEvent keyEvent) {
        ArrayList<j> arrayList = this.G;
        arrayList.clear();
        t(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zK = K();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = arrayList.get(i11);
            char alphabeticShortcut = zK ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zK && alphabeticShortcut == '\b' && i10 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f10700q.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f10700q.get(i11);
            if (jVar.getGroupId() == i10) {
                jVar.w(z11);
                jVar.setCheckable(z10);
            }
        }
    }

    @Override // l1.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.J = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f10700q.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f10700q.get(i11);
            if (jVar.getGroupId() == i10) {
                jVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f10700q.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f10700q.get(i11);
            if (jVar.getGroupId() == i10 && jVar.B(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            O(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f10697n = z10;
        O(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f10700q.size();
    }

    void t(List<j> list, int i10, KeyEvent keyEvent) {
        boolean zK = K();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f10700q.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar = this.f10700q.get(i11);
                if (jVar.hasSubMenu()) {
                    ((g) jVar.getSubMenu()).t(list, i10, keyEvent);
                }
                char alphabeticShortcut = zK ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if ((modifiers & l1.a.f316129e) == ((zK ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & l1.a.f316129e) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zK && alphabeticShortcut == '\b' && i10 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<j> arrayListH = H();
        if (this.f10705v) {
            boolean zG = false;
            for (WeakReference<n> weakReference : this.H) {
                n nVar = weakReference.get();
                if (nVar == null) {
                    this.H.remove(weakReference);
                } else {
                    zG |= nVar.g();
                }
            }
            if (zG) {
                this.f10703t.clear();
                this.f10704u.clear();
                int size = arrayListH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    j jVar = arrayListH.get(i10);
                    if (jVar.o()) {
                        this.f10703t.add(jVar);
                    } else {
                        this.f10704u.add(jVar);
                    }
                }
            } else {
                this.f10703t.clear();
                this.f10704u.clear();
                this.f10704u.addAll(H());
            }
            this.f10705v = false;
        }
    }

    public ArrayList<j> v() {
        u();
        return this.f10703t;
    }

    protected String w() {
        return N;
    }

    public Context x() {
        return this.f10695l;
    }

    public j y() {
        return this.I;
    }

    public Drawable z() {
        return this.f10709z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f10696m.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f10696m.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        j jVar = (j) a(i10, i11, i12, charSequence);
        s sVar = new s(this.f10695l, this, jVar);
        jVar.A(sVar);
        return sVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f10696m.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f10696m.getString(i13));
    }
}
