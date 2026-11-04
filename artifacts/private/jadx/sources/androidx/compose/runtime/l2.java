package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4061:1\n1#2:4062\n806#3,8:4063\n796#3,7:4071\n91#4:4078\n34#4,5:4079\n92#4:4084\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n*L\n740#1:4063,8\n756#1:4071,7\n767#1:4078\n767#1:4079,5\n767#1:4084\n*E\n"})
public final class l2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f36205g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f36207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private ArrayList<Object> f36209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36211f;

    public l2(int i10, @Nullable String str, int i11) {
        this.f36206a = i10;
        this.f36207b = str;
        this.f36208c = i11;
    }

    private final void a(Object obj) {
        ArrayList<Object> arrayList = this.f36209d;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f36209d = arrayList;
        arrayList.add(obj);
    }

    private final boolean k(g gVar) {
        ArrayList<Object> arrayList = this.f36209d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (Intrinsics.areEqual(obj, gVar) || ((obj instanceof l2) && ((l2) obj).k(gVar))) {
                    return true;
                }
            }
        }
        return false;
    }

    private final l2 l() {
        Object obj;
        l2 l2VarL;
        ArrayList<Object> arrayList = this.f36209d;
        if (arrayList == null) {
            obj = null;
            break;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayList.get(size);
            if ((obj instanceof l2) && !((l2) obj).f36210e) {
                break;
            }
        }
        l2 l2Var = obj instanceof l2 ? (l2) obj : null;
        return (l2Var == null || (l2VarL = l2Var.l()) == null) ? this : l2VarL;
    }

    public final void b(@NotNull z5 z5Var, int i10, int i11) {
        g gVarM1;
        ArrayList<Object> arrayList = this.f36209d;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f36209d = arrayList;
        }
        int i12 = 0;
        if (i10 >= 0 && (gVarM1 = z5Var.M1(i10)) != null) {
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                if (!Intrinsics.areEqual(obj, gVarM1) && (!(obj instanceof l2) || !((l2) obj).k(gVarM1))) {
                    i12++;
                }
            }
            i12 = -1;
        }
        arrayList.add(i12, z5Var.C(i11));
    }

    public final void c(int i10) {
        this.f36210e = true;
        this.f36211f = i10;
    }

    public final void d(int i10) {
        l().c(i10);
    }

    public final boolean e() {
        return this.f36210e;
    }

    public final int f() {
        return this.f36211f;
    }

    public final int g() {
        return this.f36208c;
    }

    @Nullable
    public final ArrayList<Object> h() {
        return this.f36209d;
    }

    public final int i() {
        return this.f36206a;
    }

    @Nullable
    public final String j() {
        return this.f36207b;
    }

    public final boolean m(@NotNull g gVar) {
        ArrayList<Object> arrayList = this.f36209d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof g) {
                    if (Intrinsics.areEqual(obj, gVar)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof l2) && !((l2) obj).m(gVar)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f36209d = null;
                return false;
            }
        }
        return true;
    }

    public final void n(@NotNull w5 w5Var, int i10) {
        l().a(w5Var.d(i10));
    }

    public final void o(@NotNull z5 z5Var, int i10) {
        l().a(z5Var.C(i10));
    }

    public final void p(boolean z10) {
        this.f36210e = z10;
    }

    public final void q(int i10) {
        this.f36211f = i10;
    }

    public final void r(@Nullable ArrayList<Object> arrayList) {
        this.f36209d = arrayList;
    }

    public final void s(@Nullable String str) {
        this.f36207b = str;
    }

    public final void t(int i10, @NotNull String str, int i11) {
        l().a(new l2(i10, str, i11));
    }
}
