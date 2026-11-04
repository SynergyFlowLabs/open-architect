package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.e3;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.focus.k0;
import androidx.compose.ui.focus.p0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.l0;
import androidx.compose.ui.input.pointer.q;
import androidx.compose.ui.input.pointer.s;
import androidx.compose.ui.input.pointer.y0;
import androidx.compose.ui.node.d2;
import androidx.compose.ui.node.m;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public class i extends m implements d2, androidx.compose.ui.focus.j, k0 {
    public static final int Z = 8;
    private boolean X;

    @NotNull
    private final y0 Y = (y0) v9(androidx.compose.ui.input.pointer.w0.a(new a()));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f19361w;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.i$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", i = {0, 1, 1, 1, 2, 2}, l = {androidx.media3.extractor.metadata.dvbsi.b.f67479d, 144, 182}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "firstDown", "pass", "$this$awaitEachGesture", "firstDown"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nStylusHandwriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingNode$suspendingPointerInputModifierNode$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,226:1\n65#2:227\n65#2:230\n69#2:235\n69#2:238\n60#3:228\n60#3:231\n85#3:234\n70#3:236\n70#3:239\n90#3:242\n22#4:229\n22#4:232\n22#4:237\n22#4:240\n54#5:233\n59#5:241\n118#6:243\n35#6,5:244\n119#6:249\n118#6:250\n35#6,5:251\n119#6:256\n*S KotlinDebug\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingNode$suspendingPointerInputModifierNode$1$1\n*L\n125#1:227\n126#1:230\n127#1:235\n128#1:238\n125#1:228\n126#1:231\n126#1:234\n127#1:236\n128#1:239\n128#1:242\n125#1:229\n126#1:232\n127#1:237\n128#1:240\n126#1:233\n128#1:241\n147#1:243\n147#1:244,5\n147#1:249\n184#1:250\n184#1:251,5\n184#1:256\n*E\n"})
        static final class C0131a extends k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f19363a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f19364b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f19365c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f19366d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ i f19367e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0131a(i iVar, kotlin.coroutines.d<? super C0131a> dVar) {
                super(2, dVar);
                this.f19367e = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0131a c0131a = new C0131a(this.f19367e, dVar);
                c0131a.f19366d = obj;
                return c0131a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
            
                if (r8 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
            
                if (r9 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01b0, code lost:
            
                if (r5 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01b2, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f9 -> B:42:0x00fd). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01b0 -> B:75:0x01b3). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 505
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.i.a.C0131a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0131a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objE = e3.e(l0Var, new C0131a(i.this, null), dVar);
            return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
        }
    }

    public i(@NotNull Function0<Unit> function0) {
        this.f19361w = function0;
    }

    public final void A6() {
        this.Y.A6();
    }

    @NotNull
    public final Function0<Unit> H9() {
        return this.f19361w;
    }

    public final void I9(@NotNull Function0<Unit> function0) {
        this.f19361w = function0;
    }

    @Override // androidx.compose.ui.focus.j
    public void Z(@NotNull p0 p0Var) {
        this.X = p0Var.k();
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        this.Y.p3();
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull q qVar, @NotNull s sVar, long j10) {
        this.Y.p5(qVar, sVar, j10);
    }

    @Override // androidx.compose.ui.node.d2
    public long z2() {
        return h.a().m(androidx.compose.ui.node.k.q(this));
    }
}
