package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class y extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.s2<Object> f36792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.s2<Object> f36793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.f0 f36794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36795d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", i = {0, 0, 0, 0}, l = {554}, m = "invokeSuspend", n = {"$this$sequence", "currentOperation", "currentInstance", "currentReused"}, s = {"L$0", "I$0", "I$1", "I$2"})
    @SourceDebugExtension({"SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/ComposePausableCompositionException$operationsSequence$1\n+ 2 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,567:1\n65#2:568\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/ComposePausableCompositionException$operationsSequence$1\n*L\n502#1:568\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super String>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f36800e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = y.this.new a(dVar);
            aVar.f36800e = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            kotlin.sequences.n nVar;
            int i11;
            int i12;
            String str;
            int i13;
            int i14;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i15 = this.f36799d;
            if (i15 == 0) {
                ResultKt.m(obj);
                i10 = 0;
                nVar = (kotlin.sequences.n) this.f36800e;
                i11 = 0;
                i12 = 0;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i16 = this.f36798c;
                int i17 = this.f36797b;
                int i18 = this.f36796a;
                nVar = (kotlin.sequences.n) this.f36800e;
                ResultKt.m(obj);
                i11 = i17;
                i12 = i16;
                i10 = i18;
            }
            while (i10 < Math.min(y.this.f36795d, y.this.f36794c.f12216b)) {
                int i19 = i10 + 1;
                int iW = y.this.f36794c.w(i10);
                switch (iW) {
                    case 0:
                        str = "up";
                        break;
                    case 1:
                        int i20 = i11 + 1;
                        str = "down " + y.this.f36792a.y(i11);
                        i11 = i20;
                        break;
                    case 2:
                        str = "remove " + y.this.f36794c.w(i19) + ' ' + y.this.f36794c.w(i10 + 2);
                        i19 = i10 + 3;
                        break;
                    case 3:
                        str = "move " + y.this.f36794c.w(i19) + ' ' + y.this.f36794c.w(i10 + 2) + ' ' + y.this.f36794c.w(i10 + 3);
                        i19 = i10 + 4;
                        break;
                    case 4:
                        str = "clear";
                        break;
                    case 5:
                        i13 = i10 + 2;
                        i14 = i11 + 1;
                        str = "insertBottomUp " + y.this.f36794c.w(i19) + ' ' + y.this.f36792a.y(i11);
                        i19 = i13;
                        i11 = i14;
                        break;
                    case 6:
                        i13 = i10 + 2;
                        i14 = i11 + 1;
                        str = "insertTopDown " + y.this.f36794c.w(i19) + ' ' + y.this.f36792a.y(i11);
                        i19 = i13;
                        i11 = i14;
                        break;
                    case 7:
                        int i21 = i11 + 1;
                        Object objY = y.this.f36792a.y(i11);
                        Intrinsics.checkNotNull(objY, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        i11 += 2;
                        str = "apply " + ((Function2) kotlin.jvm.internal.r1.q(objY, 2)) + ' ' + y.this.f36792a.y(i21);
                        break;
                    case 8:
                        str = "reuse " + y.this.f36793b.y(i12);
                        i12++;
                        break;
                    default:
                        str = "unknown op: " + iW;
                        break;
                }
                String str2 = i10 + ": " + str;
                this.f36800e = nVar;
                this.f36796a = i19;
                this.f36797b = i11;
                this.f36798c = i12;
                this.f36799d = 1;
                if (nVar.b(str2, this) == objL) {
                    return objL;
                }
                i10 = i19;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super String> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public y(@NotNull androidx.collection.s2<Object> s2Var, @NotNull androidx.collection.s2<Object> s2Var2, @NotNull androidx.collection.f0 f0Var, int i10, @Nullable Throwable th2) {
        super(th2);
        this.f36792a = s2Var;
        this.f36793b = s2Var2;
        this.f36794c = f0Var;
        this.f36795d = i10;
    }

    public static /* synthetic */ void e() {
    }

    private final Sequence<String> f() {
        return kotlin.sequences.o.b(new a(null));
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return StringsKt.r("\n            |Exception while applying pausable composition. Last 10 operations:\n            |" + CollectionsKt.joinToString$default(CollectionsKt.takeLast(kotlin.sequences.o.c3(f()), 10), "\n", null, null, 0, null, null, 62, null) + "\n            ", null, 1, null);
    }
}
