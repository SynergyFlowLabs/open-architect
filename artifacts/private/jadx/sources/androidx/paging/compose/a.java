package androidx.paging.compose;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.paging.compose.a$a, reason: collision with other inner class name */
    static final class C0640a extends l0 implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, Object> f71644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.paging.compose.b<T> f71645b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0640a(Function1<T, ? extends Object> function1, androidx.paging.compose.b<T> bVar) {
            super(1);
            this.f71644a = function1;
            this.f71645b = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @Nullable
        public final Object invoke(int i10) {
            if (this.f71644a == null) {
                return null;
            }
            Object objJ = this.f71645b.j(i10);
            return objJ == null ? d.f71671a : this.f71644a.invoke(objJ);
        }
    }

    static final class b extends l0 implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, Object> f71646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.paging.compose.b<T> f71647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1<T, ? extends Object> function1, androidx.paging.compose.b<T> bVar) {
            super(1);
            this.f71646a = function1;
            this.f71647b = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @NotNull
        public final Object invoke(int i10) {
            if (this.f71646a == null) {
                return e.a(i10);
            }
            Object objJ = this.f71647b.j(i10);
            return objJ == null ? e.a(i10) : this.f71646a.invoke(objJ);
        }
    }

    @NotNull
    public static final <T> Function1<Integer, Object> a(@NotNull androidx.paging.compose.b<T> bVar, @Nullable Function1<T, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new C0640a(function1, bVar);
    }

    public static /* synthetic */ Function1 b(androidx.paging.compose.b bVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        return a(bVar, function1);
    }

    @NotNull
    public static final <T> Function1<Integer, Object> c(@NotNull androidx.paging.compose.b<T> bVar, @Nullable Function1<T, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new b(function1, bVar);
    }

    public static /* synthetic */ Function1 d(androidx.paging.compose.b bVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        return c(bVar, function1);
    }
}
