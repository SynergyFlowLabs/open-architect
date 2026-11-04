package androidx.compose.foundation.text.input;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.saveable.c0;
import androidx.compose.runtime.saveable.g0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n85#2:252\n117#2,2:253\n604#3,7:255\n604#3,7:262\n1#4:269\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n*L\n44#1:252\n44#1:253,2\n70#1:255,7\n95#1:262,7\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f20326c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20327d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.input.internal.undo.f<androidx.compose.foundation.text.input.internal.undo.d> f20328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n3 f20329b;

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.v$a$a, reason: collision with other inner class name */
        @w0(parameters = 0)
        @SourceDebugExtension({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion\n*L\n1#1,251:1\n1#2:252\n120#3:253\n158#3:254\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n*L\n102#1:253\n102#1:254\n*E\n"})
        public static final class C0147a implements c0<v, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0147a f20330a = new C0147a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private static final c0<androidx.compose.foundation.text.input.internal.undo.f<androidx.compose.foundation.text.input.internal.undo.d>, Object> f20331b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f20332c;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.v$a$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n35#2,3:162\n39#2:166\n35#2,5:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n*L\n135#1:162,3\n135#1:166\n136#1:167,5\n*E\n"})
            public static final class C0148a implements c0<androidx.compose.foundation.text.input.internal.undo.f<androidx.compose.foundation.text.input.internal.undo.d>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ c0 f20333a;

                public C0148a(c0 c0Var) {
                    this.f20333a = c0Var;
                }

                @Override // androidx.compose.runtime.saveable.c0
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public androidx.compose.foundation.text.input.internal.undo.f<androidx.compose.foundation.text.input.internal.undo.d> b(Object obj) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    List list = (List) obj;
                    int iIntValue = ((Number) list.get(0)).intValue();
                    int iIntValue2 = ((Number) list.get(1)).intValue();
                    int iIntValue3 = ((Number) list.get(2)).intValue();
                    c0 c0Var = this.f20333a;
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    int i10 = 3;
                    while (i10 < iIntValue2 + 3) {
                        Object objB = c0Var.b(list.get(i10));
                        Intrinsics.checkNotNull(objB);
                        listCreateListBuilder.add(objB);
                        i10++;
                    }
                    List listBuild = CollectionsKt.build(listCreateListBuilder);
                    c0 c0Var2 = this.f20333a;
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    while (i10 < iIntValue2 + iIntValue3 + 3) {
                        Object objB2 = c0Var2.b(list.get(i10));
                        Intrinsics.checkNotNull(objB2);
                        listCreateListBuilder2.add(objB2);
                        i10++;
                    }
                    return new androidx.compose.foundation.text.input.internal.undo.f<>(listBuild, CollectionsKt.build(listCreateListBuilder2), iIntValue);
                }

                @Override // androidx.compose.runtime.saveable.c0
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public Object a(g0 g0Var, androidx.compose.foundation.text.input.internal.undo.f<androidx.compose.foundation.text.input.internal.undo.d> fVar) {
                    c0 c0Var = this.f20333a;
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    listCreateListBuilder.add(Integer.valueOf(((androidx.compose.foundation.text.input.internal.undo.f) fVar).f20116a));
                    listCreateListBuilder.add(Integer.valueOf(((androidx.compose.foundation.text.input.internal.undo.f) fVar).f20117b.size()));
                    listCreateListBuilder.add(Integer.valueOf(((androidx.compose.foundation.text.input.internal.undo.f) fVar).f20118c.size()));
                    SnapshotStateList snapshotStateList = ((androidx.compose.foundation.text.input.internal.undo.f) fVar).f20117b;
                    int size = snapshotStateList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        listCreateListBuilder.add(c0Var.a(g0Var, snapshotStateList.get(i10)));
                    }
                    SnapshotStateList snapshotStateList2 = ((androidx.compose.foundation.text.input.internal.undo.f) fVar).f20118c;
                    int size2 = snapshotStateList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        listCreateListBuilder.add(c0Var.a(g0Var, snapshotStateList2.get(i11)));
                    }
                    return CollectionsKt.build(listCreateListBuilder);
                }
            }

            static {
                androidx.compose.foundation.text.input.internal.undo.f.a aVar = androidx.compose.foundation.text.input.internal.undo.f.f20114d;
                f20331b = new C0148a(androidx.compose.foundation.text.input.internal.undo.d.f20103i.a());
                f20332c = 8;
            }

            private C0147a() {
            }

            @Override // androidx.compose.runtime.saveable.c0
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public v b(@NotNull Object obj) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                androidx.compose.foundation.text.input.internal.undo.d dVarB = obj2 != null ? androidx.compose.foundation.text.input.internal.undo.d.f20103i.a().b(obj2) : null;
                c0<androidx.compose.foundation.text.input.internal.undo.f<androidx.compose.foundation.text.input.internal.undo.d>, Object> c0Var = f20331b;
                Intrinsics.checkNotNull(obj3);
                androidx.compose.foundation.text.input.internal.undo.f<androidx.compose.foundation.text.input.internal.undo.d> fVarB = c0Var.b(obj3);
                Intrinsics.checkNotNull(fVarB);
                return new v(dVarB, fVarB);
            }

            @Override // androidx.compose.runtime.saveable.c0
            @NotNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object a(@NotNull g0 g0Var, @NotNull v vVar) {
                androidx.compose.foundation.text.input.internal.undo.d dVarG = vVar.g();
                return CollectionsKt.listOf(dVarG != null ? androidx.compose.foundation.text.input.internal.undo.d.f20103i.a().a(g0Var, dVarG) : null, f20331b.a(g0Var, vVar.f20328a));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void d() {
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            androidx.compose.foundation.text.input.internal.undo.d dVarG = g();
            aVar.x(mVarG, mVarM, function1L);
            if (dVarG != null) {
                this.f20328a.h(dVarG);
            }
            j(null);
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.input.internal.undo.d g() {
        return (androidx.compose.foundation.text.input.internal.undo.d) this.f20329b.getValue();
    }

    private final void j(androidx.compose.foundation.text.input.internal.undo.d dVar) {
        this.f20329b.setValue(dVar);
    }

    public final void c() {
        j(null);
        this.f20328a.d();
    }

    public final boolean e() {
        if (!this.f20328a.e() || g() != null) {
            return false;
        }
        int i10 = 7 & 1;
        return true;
    }

    public final boolean f() {
        if (!this.f20328a.f() && g() == null) {
            return false;
        }
        return true;
    }

    public final void h(@NotNull androidx.compose.foundation.text.input.internal.undo.d dVar) {
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            androidx.compose.foundation.text.input.internal.undo.d dVarG = g();
            aVar.x(mVarG, mVarM, function1L);
            if (dVarG == null) {
                j(dVar);
                return;
            }
            androidx.compose.foundation.text.input.internal.undo.d dVarB = w.b(dVarG, dVar);
            if (dVarB != null) {
                j(dVarB);
            } else {
                d();
                j(dVar);
            }
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    public final void i(@NotNull p pVar) {
        if (e()) {
            androidx.compose.foundation.text.input.internal.undo.e.a(pVar, this.f20328a.i());
        }
    }

    public final void k(@NotNull p pVar) {
        if (f()) {
            d();
            androidx.compose.foundation.text.input.internal.undo.e.b(pVar, this.f20328a.j());
        }
    }

    public v(@Nullable androidx.compose.foundation.text.input.internal.undo.d dVar, @NotNull androidx.compose.foundation.text.input.internal.undo.f<androidx.compose.foundation.text.input.internal.undo.d> fVar) {
        this.f20328a = fVar;
        this.f20329b = d7.g(dVar, null, 2, null);
    }

    public /* synthetic */ v(androidx.compose.foundation.text.input.internal.undo.d dVar, androidx.compose.foundation.text.input.internal.undo.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : dVar, (i10 & 2) != 0 ? new androidx.compose.foundation.text.input.internal.undo.f(null, null, 100, 3, null) : fVar);
    }
}
