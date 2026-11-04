package androidx.fragment.app;

import androidx.lifecycle.f2;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1\n*L\n1#1,222:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function0<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52054a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f52054a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return this.f52054a.requireActivity().getViewModelStore();
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2\n*L\n1#1,222:1\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f52055a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            return this.f52055a.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$3\n*L\n1#1,222:1\n*E\n"})
    public static final class c extends kotlin.jvm.internal.l0 implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f52056a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f52056a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4\n*L\n1#1,222:1\n*E\n"})
    public static final class d extends kotlin.jvm.internal.l0 implements Function0<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f52057a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return this.f52057a.requireActivity().getViewModelStore();
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5\n*L\n1#1,222:1\n*E\n"})
    public static final class e extends kotlin.jvm.internal.l0 implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<v2.a> f52058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f52059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function0<? extends v2.a> function0, Fragment fragment) {
            super(0);
            this.f52058a = function0;
            this.f52059b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            v2.a aVarInvoke;
            Function0<v2.a> function0 = this.f52058a;
            return (function0 == null || (aVarInvoke = function0.invoke()) == null) ? this.f52059b.requireActivity().getDefaultViewModelCreationExtras() : aVarInvoke;
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6\n*L\n1#1,222:1\n*E\n"})
    public static final class f extends kotlin.jvm.internal.l0 implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52060a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f52060a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f52060a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52061a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Fragment fragment) {
            super(0);
            this.f52061a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            return this.f52061a.getDefaultViewModelCreationExtras();
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52062a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Fragment fragment) {
            super(0);
            this.f52062a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            return this.f52062a.getDefaultViewModelCreationExtras();
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52063a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Fragment fragment) {
            super(0);
            this.f52063a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f52063a.getDefaultViewModelProviderFactory();
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$1\n*L\n1#1,222:1\n*E\n"})
    public static final class j extends kotlin.jvm.internal.l0 implements Function0<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52064a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f52064a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f52064a;
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2\n*L\n1#1,222:1\n*E\n"})
    public static final class k extends kotlin.jvm.internal.l0 implements Function0<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<m2> f52065a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(kotlin.f0<? extends m2> f0Var) {
            super(0);
            this.f52065a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return z0.o(this.f52065a).getViewModelStore();
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3\n*L\n1#1,222:1\n*E\n"})
    public static final class l extends kotlin.jvm.internal.l0 implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<m2> f52066a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(kotlin.f0<? extends m2> f0Var) {
            super(0);
            this.f52066a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            v2.a defaultViewModelCreationExtras;
            m2 m2VarO = z0.o(this.f52066a);
            androidx.lifecycle.z zVar = m2VarO instanceof androidx.lifecycle.z ? (androidx.lifecycle.z) m2VarO : null;
            return (zVar == null || (defaultViewModelCreationExtras = zVar.getDefaultViewModelCreationExtras()) == null) ? v2.a.b.f381327c : defaultViewModelCreationExtras;
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4\n*L\n1#1,222:1\n*E\n"})
    public static final class m extends kotlin.jvm.internal.l0 implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<m2> f52068b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(Fragment fragment, kotlin.f0<? extends m2> f0Var) {
            super(0);
            this.f52067a = fragment;
            this.f52068b = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            j2.c defaultViewModelProviderFactory;
            m2 m2VarO = z0.o(this.f52068b);
            androidx.lifecycle.z zVar = m2VarO instanceof androidx.lifecycle.z ? (androidx.lifecycle.z) m2VarO : null;
            return (zVar == null || (defaultViewModelProviderFactory = zVar.getDefaultViewModelProviderFactory()) == null) ? this.f52067a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$5\n*L\n1#1,222:1\n*E\n"})
    public static final class n extends kotlin.jvm.internal.l0 implements Function0<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52069a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Fragment fragment) {
            super(0);
            this.f52069a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f52069a;
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$6\n*L\n1#1,222:1\n*E\n"})
    public static final class o extends kotlin.jvm.internal.l0 implements Function0<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<m2> f52070a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(kotlin.f0<? extends m2> f0Var) {
            super(0);
            this.f52070a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return z0.p(this.f52070a).getViewModelStore();
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7\n*L\n1#1,222:1\n*E\n"})
    public static final class p extends kotlin.jvm.internal.l0 implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<v2.a> f52071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<m2> f52072b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(Function0<? extends v2.a> function0, kotlin.f0<? extends m2> f0Var) {
            super(0);
            this.f52071a = function0;
            this.f52072b = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            v2.a aVarInvoke;
            Function0<v2.a> function0 = this.f52071a;
            if (function0 != null && (aVarInvoke = function0.invoke()) != null) {
                return aVarInvoke;
            }
            m2 m2VarP = z0.p(this.f52072b);
            androidx.lifecycle.z zVar = m2VarP instanceof androidx.lifecycle.z ? (androidx.lifecycle.z) m2VarP : null;
            return zVar != null ? zVar.getDefaultViewModelCreationExtras() : v2.a.b.f381327c;
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8\n*L\n1#1,222:1\n*E\n"})
    public static final class q extends kotlin.jvm.internal.l0 implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f52073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<m2> f52074b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(Fragment fragment, kotlin.f0<? extends m2> f0Var) {
            super(0);
            this.f52073a = fragment;
            this.f52074b = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            j2.c defaultViewModelProviderFactory;
            m2 m2VarP = z0.p(this.f52074b);
            androidx.lifecycle.z zVar = m2VarP instanceof androidx.lifecycle.z ? (androidx.lifecycle.z) m2VarP : null;
            return (zVar == null || (defaultViewModelProviderFactory = zVar.getDefaultViewModelProviderFactory()) == null) ? this.f52073a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$2\n*L\n1#1,222:1\n*E\n"})
    public static final class r extends kotlin.jvm.internal.l0 implements Function0<m2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<m2> f52075a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(Function0<? extends m2> function0) {
            super(0);
            this.f52075a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m2 invoke() {
            return this.f52075a.invoke();
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4\n*L\n1#1,222:1\n*E\n"})
    public static final class s extends kotlin.jvm.internal.l0 implements Function0<m2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<m2> f52076a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(Function0<? extends m2> function0) {
            super(0);
            this.f52076a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m2 invoke() {
            return this.f52076a.invoke();
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends f2> kotlin.f0<VM> c(Fragment fragment, Function0<? extends j2.c> function0) {
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = j1.d(f2.class);
        a aVar = new a(fragment);
        b bVar = new b(fragment);
        if (function0 == null) {
            function0 = new c(fragment);
        }
        return h(fragment, dVarD, aVar, bVar, function0);
    }

    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends f2> kotlin.f0<VM> d(Fragment fragment, Function0<? extends v2.a> function0, Function0<? extends j2.c> function1) {
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = j1.d(f2.class);
        d dVar = new d(fragment);
        e eVar = new e(function0, fragment);
        if (function1 == null) {
            function1 = new f(fragment);
        }
        return h(fragment, dVarD, dVar, eVar, function1);
    }

    public static /* synthetic */ kotlin.f0 e(Fragment fragment, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = j1.d(f2.class);
        a aVar = new a(fragment);
        b bVar = new b(fragment);
        if (function0 == null) {
            function0 = new c(fragment);
        }
        return h(fragment, dVarD, aVar, bVar, function0);
    }

    public static /* synthetic */ kotlin.f0 f(Fragment fragment, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = j1.d(f2.class);
        d dVar = new d(fragment);
        e eVar = new e(function0, fragment);
        if (function1 == null) {
            function1 = new f(fragment);
        }
        return h(fragment, dVarD, dVar, eVar, function1);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    @androidx.annotation.l0
    public static final /* synthetic */ kotlin.f0 g(Fragment fragment, kotlin.reflect.d dVar, Function0 function0, Function0 function1) {
        return h(fragment, dVar, function0, new g(fragment), function1);
    }

    @androidx.annotation.l0
    @NotNull
    public static final <VM extends f2> kotlin.f0<VM> h(@NotNull Fragment fragment, @NotNull kotlin.reflect.d<VM> dVar, @NotNull Function0<? extends l2> function0, @NotNull Function0<? extends v2.a> function1, @Nullable Function0<? extends j2.c> function2) {
        if (function2 == null) {
            function2 = new i(fragment);
        }
        return new i2(dVar, function0, function2, function1);
    }

    public static /* synthetic */ kotlin.f0 i(Fragment fragment, kotlin.reflect.d dVar, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return g(fragment, dVar, function0, function1);
    }

    public static /* synthetic */ kotlin.f0 j(Fragment fragment, kotlin.reflect.d dVar, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new h(fragment);
        }
        if ((i10 & 8) != 0) {
            function2 = null;
        }
        return h(fragment, dVar, function0, function1, function2);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends f2> kotlin.f0<VM> k(Fragment fragment, Function0<? extends m2> function0, Function0<? extends j2.c> function1) {
        kotlin.f0 f0VarB = kotlin.g0.b(kotlin.j0.NONE, new r(function0));
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = j1.d(f2.class);
        k kVar = new k(f0VarB);
        l lVar = new l(f0VarB);
        if (function1 == null) {
            function1 = new m(fragment, f0VarB);
        }
        return h(fragment, dVarD, kVar, lVar, function1);
    }

    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends f2> kotlin.f0<VM> l(Fragment fragment, Function0<? extends m2> function0, Function0<? extends v2.a> function1, Function0<? extends j2.c> function2) {
        kotlin.f0 f0VarB = kotlin.g0.b(kotlin.j0.NONE, new s(function0));
        int i10 = 1 ^ 4;
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = j1.d(f2.class);
        o oVar = new o(f0VarB);
        p pVar = new p(function1, f0VarB);
        if (function2 == null) {
            function2 = new q(fragment, f0VarB);
        }
        return h(fragment, dVarD, oVar, pVar, function2);
    }

    public static /* synthetic */ kotlin.f0 m(Fragment fragment, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new j(fragment);
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        kotlin.f0 f0VarB = kotlin.g0.b(kotlin.j0.NONE, new r(function0));
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = j1.d(f2.class);
        k kVar = new k(f0VarB);
        l lVar = new l(f0VarB);
        if (function1 == null) {
            function1 = new m(fragment, f0VarB);
        }
        return h(fragment, dVarD, kVar, lVar, function1);
    }

    public static /* synthetic */ kotlin.f0 n(Fragment fragment, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new n(fragment);
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        kotlin.f0 f0VarB = kotlin.g0.b(kotlin.j0.NONE, new s(function0));
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = j1.d(f2.class);
        o oVar = new o(f0VarB);
        p pVar = new p(function1, f0VarB);
        if (function2 == null) {
            function2 = new q(fragment, f0VarB);
        }
        return h(fragment, dVarD, oVar, pVar, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m2 o(kotlin.f0<? extends m2> f0Var) {
        return f0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m2 p(kotlin.f0<? extends m2> f0Var) {
        return f0Var.getValue();
    }
}
