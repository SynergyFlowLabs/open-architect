package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPlaceholderPaddedListDiffHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderPaddedListDiffHelper.kt\nandroidx/paging/PlaceholderPaddedListDiffHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,532:1\n1747#2,3:533\n*S KotlinDebug\n*F\n+ 1 PlaceholderPaddedListDiffHelper.kt\nandroidx/paging/PlaceholderPaddedListDiffHelperKt\n*L\n84#1:533,3\n*E\n"})
public final class m2 {

    public static final class a extends androidx.recyclerview.widget.k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l2<T> f72367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l2<T> f72368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.recyclerview.widget.k.f<T> f72369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f72370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f72371e;

        a(l2<T> l2Var, l2<T> l2Var2, androidx.recyclerview.widget.k.f<T> fVar, int i10, int i11) {
            this.f72367a = l2Var;
            this.f72368b = l2Var2;
            this.f72369c = fVar;
            this.f72370d = i10;
            this.f72371e = i11;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.recyclerview.widget.k.b
        public boolean a(int i10, int i11) {
            Object item = this.f72367a.getItem(i10);
            Object item2 = this.f72368b.getItem(i11);
            if (item == item2) {
                return true;
            }
            return this.f72369c.a(item, item2);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.recyclerview.widget.k.b
        public boolean b(int i10, int i11) {
            Object item = this.f72367a.getItem(i10);
            Object item2 = this.f72368b.getItem(i11);
            if (item == item2) {
                return true;
            }
            return this.f72369c.b(item, item2);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.recyclerview.widget.k.b
        @Nullable
        public Object c(int i10, int i11) {
            Object item = this.f72367a.getItem(i10);
            Object item2 = this.f72368b.getItem(i11);
            return item == item2 ? Boolean.TRUE : this.f72369c.c(item, item2);
        }

        @Override // androidx.recyclerview.widget.k.b
        public int d() {
            return this.f72371e;
        }

        @Override // androidx.recyclerview.widget.k.b
        public int e() {
            return this.f72370d;
        }
    }

    @NotNull
    public static final <T> k2 a(@NotNull l2<T> l2Var, @NotNull l2<T> newList, @NotNull androidx.recyclerview.widget.k.f<T> diffCallback) {
        Intrinsics.checkNotNullParameter(l2Var, "<this>");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        a aVar = new a(l2Var, newList, diffCallback, l2Var.c(), newList.c());
        boolean z10 = true;
        androidx.recyclerview.widget.k.e eVarC = androidx.recyclerview.widget.k.c(aVar, true);
        Intrinsics.checkNotNullExpressionValue(eVarC, "PlaceholderPaddedList<T>…    },\n        true\n    )");
        int i10 = 1 >> 0;
        Iterable iterableW1 = kotlin.ranges.r.W1(0, l2Var.c());
        if ((iterableW1 instanceof Collection) && ((Collection) iterableW1).isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = iterableW1.iterator();
            while (it.hasNext()) {
                if (eVarC.c(((IntIterator) it).nextInt()) != -1) {
                }
            }
            z10 = false;
        }
        return new k2(eVarC, z10);
    }

    public static final <T> void b(@NotNull l2<T> l2Var, @NotNull androidx.recyclerview.widget.v callback, @NotNull l2<T> newList, @NotNull k2 diffResult) {
        Intrinsics.checkNotNullParameter(l2Var, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        if (diffResult.b()) {
            f1.f71862a.a(l2Var, newList, callback, diffResult);
        } else {
            z.f72791a.b(callback, l2Var, newList);
        }
    }

    public static final int c(@NotNull l2<?> l2Var, @NotNull k2 diffResult, @NotNull l2<?> newList, int i10) {
        int iC;
        Intrinsics.checkNotNullParameter(l2Var, "<this>");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(newList, "newList");
        if (!diffResult.b()) {
            return kotlin.ranges.r.J(i10, kotlin.ranges.r.W1(0, newList.getSize()));
        }
        int i11 = i10 - l2Var.i();
        int iC2 = l2Var.c();
        if (i11 >= 0 && i11 < iC2) {
            for (int i12 = 0; i12 < 30; i12++) {
                int i13 = 3 >> 1;
                int i14 = ((i12 / 2) * (i12 % 2 == 1 ? -1 : 1)) + i11;
                if (i14 >= 0 && i14 < l2Var.c() && (iC = diffResult.a().c(i14)) != -1) {
                    return iC + newList.i();
                }
            }
        }
        return kotlin.ranges.r.J(i10, kotlin.ranges.r.W1(0, newList.getSize()));
    }
}
