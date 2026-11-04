package androidx.compose.animation.core;

import androidx.compose.animation.core.p1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1072:1\n26#2:1073\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n*L\n503#1:1073\n*E\n"})
public abstract class r1<T, E extends p1<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13244d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.t1<E> f13247c;

    public /* synthetic */ r1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
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
    public E a(T t10, @androidx.annotation.g0(from = 0) int i10) {
        E e10 = (E) c(t10);
        this.f13247c.j0(i10, e10);
        return e10;
    }

    @NotNull
    public E b(T t10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return (E) a(t10, Math.round(this.f13245a * f10));
    }

    @NotNull
    public abstract E c(T t10);

    @androidx.annotation.g0(from = 0)
    public final int d() {
        return this.f13246b;
    }

    @androidx.annotation.g0(from = 0)
    public final int e() {
        return this.f13245a;
    }

    @NotNull
    public final androidx.collection.t1<E> f() {
        return this.f13247c;
    }

    public final void g(@androidx.annotation.g0(from = 0) int i10) {
        this.f13246b = i10;
    }

    public final void h(@androidx.annotation.g0(from = 0) int i10) {
        this.f13245a = i10;
    }

    @NotNull
    public final E i(@NotNull E e10, @NotNull l0 l0Var) {
        e10.c(l0Var);
        return e10;
    }

    private r1() {
        this.f13245a = 300;
        this.f13247c = androidx.collection.k0.j();
    }
}
