package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.saveable.c0;
import androidx.compose.runtime.saveable.g0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n97#2,4:162\n97#2,4:166\n51#2,4:171\n51#2,4:175\n1#3:170\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager\n*L\n42#1:162,4\n43#1:166,4\n77#1:171,4\n95#1:175,4\n*E\n"})
public final class f<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f20114d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f20115e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private SnapshotStateList<T> f20117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private SnapshotStateList<T> f20118c;

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.undo.f$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n35#2,3:162\n39#2:166\n35#2,5:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n*L\n135#1:162,3\n135#1:166\n136#1:167,5\n*E\n"})
        public static final class C0143a implements c0<f<T>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0<T, Object> f20119a;

            public C0143a(c0<T, Object> c0Var) {
                this.f20119a = c0Var;
            }

            @Override // androidx.compose.runtime.saveable.c0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f<T> b(Object obj) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                int iIntValue = ((Number) list.get(0)).intValue();
                int iIntValue2 = ((Number) list.get(1)).intValue();
                int iIntValue3 = ((Number) list.get(2)).intValue();
                c0<T, Object> c0Var = this.f20119a;
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                int i10 = 3 << 3;
                int i11 = 3;
                while (i11 < iIntValue2 + 3) {
                    T tB = c0Var.b(list.get(i11));
                    Intrinsics.checkNotNull(tB);
                    listCreateListBuilder.add(tB);
                    i11++;
                }
                List listBuild = CollectionsKt.build(listCreateListBuilder);
                c0<T, Object> c0Var2 = this.f20119a;
                List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                while (i11 < iIntValue2 + iIntValue3 + 3) {
                    T tB2 = c0Var2.b(list.get(i11));
                    Intrinsics.checkNotNull(tB2);
                    listCreateListBuilder2.add(tB2);
                    i11++;
                }
                return new f<>(listBuild, CollectionsKt.build(listCreateListBuilder2), iIntValue);
            }

            @Override // androidx.compose.runtime.saveable.c0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object a(g0 g0Var, f<T> fVar) {
                c0<T, Object> c0Var = this.f20119a;
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                listCreateListBuilder.add(Integer.valueOf(((f) fVar).f20116a));
                listCreateListBuilder.add(Integer.valueOf(((f) fVar).f20117b.size()));
                listCreateListBuilder.add(Integer.valueOf(((f) fVar).f20118c.size()));
                SnapshotStateList snapshotStateList = ((f) fVar).f20117b;
                int size = snapshotStateList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    listCreateListBuilder.add(c0Var.a(g0Var, snapshotStateList.get(i10)));
                }
                SnapshotStateList snapshotStateList2 = ((f) fVar).f20118c;
                int size2 = snapshotStateList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    listCreateListBuilder.add(c0Var.a(g0Var, snapshotStateList2.get(i11)));
                }
                return CollectionsKt.build(listCreateListBuilder);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ <T> c0<f<T>, Object> a(c0<T, Object> c0Var) {
            Intrinsics.needClassReification();
            return new C0143a(c0Var);
        }

        private a() {
        }
    }

    public f() {
        this(null, null, 0, 7, null);
    }

    public final void d() {
        this.f20117b.clear();
        this.f20118c.clear();
    }

    public final boolean e() {
        return !this.f20118c.isEmpty();
    }

    public final boolean f() {
        return !this.f20117b.isEmpty();
    }

    public final int g() {
        return this.f20117b.size() + this.f20118c.size();
    }

    public final void h(T t10) {
        this.f20118c.clear();
        while (g() > this.f20116a - 1) {
            CollectionsKt.removeFirst(this.f20117b);
        }
        this.f20117b.add(t10);
    }

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
    public final T i() {
        if (!e()) {
            androidx.compose.foundation.internal.e.i("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        T t10 = (T) CollectionsKt.removeLast(this.f20118c);
        this.f20117b.add(t10);
        return t10;
    }

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
    public final T j() {
        if (!f()) {
            androidx.compose.foundation.internal.e.i("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        T t10 = (T) CollectionsKt.removeLast(this.f20117b);
        this.f20118c.add(t10);
        return t10;
    }

    public f(@NotNull List<? extends T> list, @NotNull List<? extends T> list2, int i10) {
        this.f20116a = i10;
        if (!(i10 >= 0)) {
            androidx.compose.foundation.internal.e.g("Capacity must be a positive integer");
        }
        if (!(list2.size() + list.size() <= i10)) {
            androidx.compose.foundation.internal.e.g("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(list);
        this.f20117b = snapshotStateList;
        SnapshotStateList<T> snapshotStateList2 = new SnapshotStateList<>();
        snapshotStateList2.addAll(list2);
        this.f20118c = snapshotStateList2;
    }

    public /* synthetic */ f(List list, List list2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 4) != 0 ? 100 : i10);
    }
}
