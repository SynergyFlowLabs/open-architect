package androidx.compose.foundation.text.selection;

import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.compose.runtime.d7;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.annotation.w0(28)
@SourceDebugExtension({"SMAP\nPlatformSelectionBehaviors.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,346:1\n85#2:347\n117#2,2:348\n1#3:350\n116#4,10:351\n116#4,10:361\n71#5,5:371\n*S KotlinDebug\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl\n*L\n120#1:347\n120#1:348,2\n176#1:351,10\n188#1:361,10\n214#1:371,5\n*E\n"})
public final class y implements x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f21507i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f21508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f21509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g0 f21510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final y0.f f21511d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private TextClassifier f21513f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f21512e = kotlinx.coroutines.sync.g.b(false, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21514g = d7.g(null, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f21515h = new Object();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", f = "PlatformSelectionBehaviors.android.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {351, 361}, m = "classifyText-M8tDOmk", n = {"text", "textClassifier", "$this$withLock_u24default$iv", "selection", "text", "textClassification", "$this$withLock_u24default$iv", "selection"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f21518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f21519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f21520e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f21522g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21520e = obj;
            this.f21522g |= Integer.MIN_VALUE;
            return y.this.m(null, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenu$2", f = "PlatformSelectionBehaviors.android.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<TextClassifier, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21524b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CharSequence f21526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f21527e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f21526d = charSequence;
            this.f21527e = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = y.this.new b(this.f21526d, this.f21527e, dVar);
            bVar.f21524b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21523a;
            if (i10 == 0) {
                ResultKt.m(obj);
                TextClassifier textClassifier = (TextClassifier) this.f21524b;
                y yVar = y.this;
                CharSequence charSequence = this.f21526d;
                long j10 = this.f21527e;
                this.f21523a = 1;
                if (yVar.m(charSequence, j10, textClassifier, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TextClassifier textClassifier, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(textClassifier, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", i = {0, 1}, l = {351, 256, 265}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPlatformSelectionBehaviors.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,346:1\n116#2,10:347\n*S KotlinDebug\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2\n*L\n252#1:347,10\n*E\n"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21530c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<TextClassifier, kotlin.coroutines.d<? super T>, Object> f21532e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21533a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextClassifier f21534b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<TextClassifier, kotlin.coroutines.d<? super T>, Object> f21535c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(TextClassifier textClassifier, Function2<? super TextClassifier, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f21534b = textClassifier;
                this.f21535c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f21534b, this.f21535c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f21533a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                TextClassifier textClassifier = this.f21534b;
                if (textClassifier == null) {
                    return null;
                }
                Function2<TextClassifier, kotlin.coroutines.d<? super T>, Object> function2 = this.f21535c;
                this.f21533a = 1;
                Object objInvoke = function2.invoke(textClassifier, this);
                return objInvoke == objL ? objL : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super TextClassifier>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21536a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f21537b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y yVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f21537b = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f21537b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f21536a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                TextClassifier textClassifierA = q3.f21346a.a(this.f21537b.f21509b, this.f21537b.f21510c);
                this.f21537b.f21513f = textClassifierA;
                return textClassifierA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super TextClassifier> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super TextClassifier, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f21532e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y.this.new c(this.f21532e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00a4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            y yVar;
            kotlinx.coroutines.sync.a aVar2;
            TextClassifier textClassifier;
            Object objE;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21530c;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = y.this.f21512e;
                    yVar = y.this;
                    this.f21528a = aVar;
                    this.f21529b = yVar;
                    this.f21530c = 1;
                    if (aVar.h(null, this) != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                        return obj;
                    }
                    aVar2 = (kotlinx.coroutines.sync.a) this.f21528a;
                    try {
                        ResultKt.m(obj);
                        textClassifier = (TextClassifier) obj;
                        aVar = aVar2;
                        aVar.i(null);
                        a aVar3 = new a(textClassifier, this.f21532e, null);
                        this.f21528a = null;
                        this.f21529b = null;
                        this.f21530c = 3;
                        objE = kotlinx.coroutines.b4.e(200L, aVar3, this);
                        if (objE != objL) {
                            return objE;
                        }
                        return objL;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.i(null);
                        throw th;
                    }
                }
                yVar = (y) this.f21529b;
                kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) this.f21528a;
                ResultKt.m(obj);
                aVar = aVar4;
                textClassifier = yVar.f21513f;
                if (textClassifier == null || textClassifier.isDestroyed()) {
                    b bVar = new b(yVar, null);
                    this.f21528a = aVar;
                    this.f21529b = null;
                    this.f21530c = 2;
                    Object objE2 = kotlinx.coroutines.b4.e(300L, bVar, this);
                    if (objE2 != objL) {
                        aVar2 = aVar;
                        obj = objE2;
                        textClassifier = (TextClassifier) obj;
                        aVar = aVar2;
                        aVar.i(null);
                        a aVar5 = new a(textClassifier, this.f21532e, null);
                        this.f21528a = null;
                        this.f21529b = null;
                        this.f21530c = 3;
                        objE = kotlinx.coroutines.b4.e(200L, aVar5, this);
                        if (objE != objL) {
                            return objE;
                        }
                    }
                } else {
                    aVar.i(null);
                    a aVar6 = new a(textClassifier, this.f21532e, null);
                    this.f21528a = null;
                    this.f21529b = null;
                    this.f21530c = 3;
                    objE = kotlinx.coroutines.b4.e(200L, aVar6, this);
                    if (objE != objL) {
                        return objE;
                    }
                }
                return objL;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                aVar2.i(null);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", i = {0, 0, 0, 1}, l = {351, androidx.media2.widget.f.i.f59801t0}, m = "invokeSuspend", n = {"suggestedSelection", "$this$withLock_u24default$iv", "newSelection", "newSelection"}, s = {"L$0", "L$1", "J$0", "J$0"})
    @SourceDebugExtension({"SMAP\nPlatformSelectionBehaviors.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,346:1\n116#2,10:347\n*S KotlinDebug\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2\n*L\n149#1:347,10\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<TextClassifier, kotlin.coroutines.d<? super androidx.compose.ui.text.w3>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f21540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f21541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f21543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CharSequence f21544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f21545h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ y f21546i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence, long j10, y yVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f21544g = charSequence;
            this.f21545h = j10;
            this.f21546i = yVar;
            int i10 = 3 | 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f21544g, this.f21545h, this.f21546i, dVar);
            dVar2.f21543f = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long jB;
            long j10;
            kotlinx.coroutines.sync.a aVar;
            CharSequence charSequence;
            TextSelection textSelection;
            y yVar;
            kotlinx.coroutines.sync.a aVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21542e;
            if (i10 == 0) {
                ResultKt.m(obj);
                TextClassifier textClassifier = (TextClassifier) this.f21543f;
                TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(this.f21544g, androidx.compose.ui.text.w3.l(this.f21545h), androidx.compose.ui.text.w3.k(this.f21545h)).setDefaultLocales(this.f21546i.n());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 31) {
                    defaultLocales.setIncludeTextClassification(true);
                }
                TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
                jB = androidx.compose.ui.text.x3.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
                if (i11 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                    y yVar2 = this.f21546i;
                    CharSequence charSequence2 = this.f21544g;
                    this.f21541d = jB;
                    this.f21542e = 2;
                    if (yVar2.m(charSequence2, jB, textClassifier, this) != objL) {
                        j10 = jB;
                        jB = j10;
                    }
                } else {
                    aVar = this.f21546i.f21512e;
                    y yVar3 = this.f21546i;
                    charSequence = this.f21544g;
                    this.f21543f = textSelectionSuggestSelection;
                    this.f21538a = aVar;
                    this.f21539b = yVar3;
                    this.f21540c = charSequence;
                    this.f21541d = jB;
                    this.f21542e = 1;
                    if (aVar.h(null, this) != objL) {
                        textSelection = textSelectionSuggestSelection;
                        yVar = yVar3;
                        CharSequence charSequence3 = charSequence;
                        aVar2 = aVar;
                        TextClassification textClassification = textSelection.getTextClassification();
                        Intrinsics.checkNotNull(textClassification);
                        yVar.q(new p3(charSequence3, jB, textClassification, null));
                        Unit unit = Unit.f312394a;
                        aVar2.i(null);
                    }
                }
                return objL;
            }
            if (i10 == 1) {
                long j11 = this.f21541d;
                charSequence = (CharSequence) this.f21540c;
                yVar = (y) this.f21539b;
                aVar = (kotlinx.coroutines.sync.a) this.f21538a;
                textSelection = (TextSelection) this.f21543f;
                ResultKt.m(obj);
                jB = j11;
                CharSequence charSequence4 = charSequence;
                aVar2 = aVar;
                try {
                    TextClassification textClassification2 = textSelection.getTextClassification();
                    Intrinsics.checkNotNull(textClassification2);
                    yVar.q(new p3(charSequence4, jB, textClassification2, null));
                    Unit unit2 = Unit.f312394a;
                    aVar2.i(null);
                } catch (Throwable th2) {
                    aVar2.i(null);
                    throw th2;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f21541d;
                ResultKt.m(obj);
                jB = j10;
            }
            return androidx.compose.ui.text.w3.b(jB);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TextClassifier textClassifier, kotlin.coroutines.d<? super androidx.compose.ui.text.w3> dVar) {
            return ((d) create(textClassifier, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public y(@NotNull CoroutineContext coroutineContext, @NotNull Context context, @NotNull g0 g0Var, @Nullable y0.f fVar) {
        this.f21508a = coroutineContext;
        this.f21509b = context;
        this.f21510c = g0Var;
        this.f21511d = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object m(CharSequence charSequence, long j10, TextClassifier textClassifier, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        TextClassifier textClassifier2;
        long j11;
        CharSequence charSequence2;
        TextClassification textClassificationClassifyText;
        kotlinx.coroutines.sync.a aVar3;
        long j12;
        CharSequence charSequence3;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f21522g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f21522g = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f21520e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f21522g;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar2 = this.f21512e;
                aVar.f21516a = charSequence;
                aVar.f21517b = textClassifier;
                aVar.f21518c = aVar2;
                aVar.f21519d = j10;
                aVar.f21522g = 1;
                if (aVar2.h(null, aVar) != objL) {
                    textClassifier2 = textClassifier;
                    j11 = j10;
                    charSequence2 = charSequence;
                }
                return objL;
            }
            if (i11 == 1) {
                j11 = aVar.f21519d;
                aVar2 = (kotlinx.coroutines.sync.a) aVar.f21518c;
                textClassifier2 = (TextClassifier) aVar.f21517b;
                charSequence2 = (CharSequence) aVar.f21516a;
                ResultKt.m(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j13 = aVar.f21519d;
                aVar3 = (kotlinx.coroutines.sync.a) aVar.f21518c;
                textClassificationClassifyText = (TextClassification) aVar.f21517b;
                CharSequence charSequence4 = (CharSequence) aVar.f21516a;
                ResultKt.m(obj);
                charSequence3 = charSequence4;
                j12 = j13;
            }
            try {
                q(new p3(charSequence3, j12, textClassificationClassifyText, null));
                return Unit.f312394a;
            } finally {
                aVar3.i(null);
            }
            p3 p3VarO = o();
            if (p3VarO != null && d0.g(p3VarO, charSequence2, j11)) {
                Unit unit = Unit.f312394a;
                aVar2.i(null);
                return unit;
            }
            Unit unit2 = Unit.f312394a;
            aVar2.i(null);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, androidx.compose.ui.text.w3.l(j11), androidx.compose.ui.text.w3.k(j11)).setDefaultLocales(n()).build());
            kotlinx.coroutines.sync.a aVar4 = this.f21512e;
            aVar.f21516a = charSequence2;
            aVar.f21517b = textClassificationClassifyText;
            aVar.f21518c = aVar4;
            aVar.f21519d = j11;
            aVar.f21522g = 2;
            if (aVar4.h(null, aVar) != objL) {
                aVar3 = aVar4;
                j12 = j11;
                charSequence3 = charSequence2;
                q(new p3(charSequence3, j12, textClassificationClassifyText, null));
                return Unit.f312394a;
            }
            return objL;
        } catch (Throwable th2) {
            aVar2.i(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocaleList n() {
        LocaleList localeListC;
        y0.f fVar = this.f21511d;
        return (fVar == null || (localeListC = q3.f21346a.c(fVar)) == null) ? new LocaleList(y0.e.f390671b.a().b()) : localeListC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final p3 o() {
        return (p3) this.f21514g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object p(Function2<? super TextClassifier, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super T> dVar) {
        return kotlinx.coroutines.i.h(this.f21508a, new c(function2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(p3 p3Var) {
        this.f21514g.setValue(p3Var);
    }

    @Override // androidx.compose.foundation.text.selection.x
    @Nullable
    public Object a(@NotNull CharSequence charSequence, long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return (charSequence.length() == 0 || androidx.compose.ui.text.w3.h(j10)) ? Unit.f312394a : p(new b(charSequence, j10, null), dVar);
    }

    @Override // androidx.compose.foundation.text.selection.x
    @Nullable
    public Object b(@NotNull CharSequence charSequence, long j10, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.text.w3> dVar) {
        if (charSequence.length() == 0 || androidx.compose.ui.text.w3.h(j10)) {
            return null;
        }
        return p(new d(charSequence, j10, this, null), dVar);
    }

    public final void l(@NotNull a0.a aVar, @NotNull CharSequence charSequence, long j10, @NotNull Function1<? super a0.a, Unit> function1) {
        TextClassification textClassificationR = r(charSequence, j10);
        if (textClassificationR == null) {
            function1.invoke(aVar);
            return;
        }
        if (!textClassificationR.getActions().isEmpty()) {
            a0.c.c(aVar, this.f21515h, textClassificationR, 0);
        } else if (q3.f21346a.b(textClassificationR)) {
            a0.c.c(aVar, this.f21515h, textClassificationR, -1);
        }
        function1.invoke(aVar);
        List<RemoteAction> actions = textClassificationR.getActions();
        int size = actions.size();
        for (int i10 = 0; i10 < size; i10++) {
            actions.get(i10);
            if (i10 > 0) {
                a0.c.c(aVar, this.f21515h, textClassificationR, i10);
            }
        }
    }

    @Nullable
    public final TextClassification r(@NotNull CharSequence charSequence, long j10) {
        if (!kotlinx.coroutines.sync.a.C2318a.c(this.f21512e, null, 1, null)) {
            return null;
        }
        p3 p3VarO = o();
        TextClassification textClassificationH = (p3VarO == null || !d0.g(p3VarO, charSequence, j10)) ? null : p3VarO.h();
        kotlinx.coroutines.sync.a.C2318a.d(this.f21512e, null, 1, null);
        return textClassificationH;
    }
}
