package androidx.activity.compose;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,157:1\n1225#2,6:158\n1225#2,6:164\n1225#2,6:170\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:158,6\n98#1:164,6\n102#1:170,6\n*E\n"})
public final class d {

    @SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,157:1\n64#2,5:158\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1\n*L\n105#1:158,5\n*E\n"})
    static final class a extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.activity.compose.b<I> f9797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.k f9798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g.a<I, O> f9800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n7<Function1<O, Unit>> f9801e;

        /* JADX INFO: renamed from: androidx.activity.compose.d$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1\n*L\n1#1,490:1\n105#2:491\n*E\n"})
        public static final class C0023a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.activity.compose.b f9802a;

            public C0023a(androidx.activity.compose.b bVar) {
                this.f9802a = bVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f9802a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.activity.compose.b<I> bVar, androidx.activity.result.k kVar, String str, g.a<I, O> aVar, n7<? extends Function1<? super O, Unit>> n7Var) {
            super(1);
            this.f9797a = bVar;
            this.f9798b = kVar;
            this.f9799c = str;
            this.f9800d = aVar;
            this.f9801e = n7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(n7 n7Var, Object obj) {
            ((Function1) n7Var.getValue()).invoke(obj);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(v1 v1Var) {
            androidx.activity.compose.b<I> bVar = this.f9797a;
            androidx.activity.result.k kVar = this.f9798b;
            String str = this.f9799c;
            g.a<I, O> aVar = this.f9800d;
            final n7<Function1<O, Unit>> n7Var = this.f9801e;
            bVar.c((androidx.activity.result.h<I>) kVar.m(str, aVar, new androidx.activity.result.a() { // from class: androidx.activity.compose.c
                @Override // androidx.activity.result.a
                public final void a(Object obj) {
                    d.a.f(n7Var, obj);
                }
            }));
            return new C0023a(this.f9797a);
        }
    }

    static final class b extends l0 implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9803a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <I, O> k<I, O> a(@NotNull g.a<I, O> aVar, @NotNull Function1<? super O, Unit> function1, @Nullable c0 c0Var, int i10) {
        androidx.activity.result.k kVar;
        if (m0.l0()) {
            m0.A0(-1408504823, i10, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        n7 n7VarW = w6.w(aVar, c0Var, i10 & 14);
        n7 n7VarW2 = w6.w(function1, c0Var, (i10 >> 3) & 14);
        String str = (String) androidx.compose.runtime.saveable.i.i(new Object[0], null, null, b.f9803a, c0Var, 3072, 6);
        androidx.activity.result.l lVarA = h.f9818a.a(c0Var, 6);
        if (lVarA == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        androidx.activity.result.k activityResultRegistry = lVarA.getActivityResultRegistry();
        Object objI0 = c0Var.i0();
        c0.a aVar2 = c0.f35327a;
        if (objI0 == aVar2.a()) {
            objI0 = new androidx.activity.compose.b();
            c0Var.Y(objI0);
        }
        androidx.activity.compose.b bVar = (androidx.activity.compose.b) objI0;
        Object objI1 = c0Var.i0();
        if (objI1 == aVar2.a()) {
            objI1 = new k(bVar, n7VarW);
            c0Var.Y(objI1);
        }
        k<I, O> kVar2 = (k) objI1;
        boolean zK0 = c0Var.k0(bVar) | c0Var.k0(activityResultRegistry) | c0Var.D(str) | c0Var.k0(aVar) | c0Var.D(n7VarW2);
        Object objI2 = c0Var.i0();
        if (zK0 || objI2 == aVar2.a()) {
            kVar = activityResultRegistry;
            Object aVar3 = new a(bVar, kVar, str, aVar, n7VarW2);
            c0Var.Y(aVar3);
            objI2 = aVar3;
        } else {
            kVar = activityResultRegistry;
        }
        androidx.activity.result.k kVar3 = kVar;
        b2.b(kVar3, str, aVar, (Function1) objI2, c0Var, (i10 << 6) & 896);
        if (m0.l0()) {
            m0.z0();
        }
        return kVar2;
    }
}
