package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.n;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1, reason: invalid class name */
    @f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, com.planner5d.library.engine.input.f.b.f160710n}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1<T> extends k implements Function2<n<? super List<? extends T>>, d<? super Unit>, Object> {
        final /* synthetic */ Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$size = i10;
            this.$step = i11;
            this.$iterator = it;
            this.$reuseBuffer = z10;
            this.$partialWindows = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x010e  */
        /* JADX WARN: Code duplicated, block: B:56:0x012d  */
        /* JADX WARN: Code duplicated, block: B:57:0x012f  */
        /* JADX WARN: Code duplicated, block: B:60:0x0146  */
        /* JADX WARN: Code duplicated, block: B:61:0x0148 A[PHI: r1 r5 r6
          0x0148: PHI (r1v15 java.util.Iterator<T>) = (r1v13 java.util.Iterator<T>), (r1v20 java.util.Iterator<T>) binds: [B:59:0x0144, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
          0x0148: PHI (r5v6 kotlin.collections.RingBuffer) = (r5v3 kotlin.collections.RingBuffer), (r5v9 kotlin.collections.RingBuffer) binds: [B:59:0x0144, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
          0x0148: PHI (r6v3 kotlin.sequences.n) = (r6v2 kotlin.sequences.n), (r6v5 kotlin.sequences.n) binds: [B:59:0x0144, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:83:0x011b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0128 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c0 -> B:18:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0144 -> B:61:0x0148). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x017a -> B:74:0x017d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 415
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(n<? super List<? extends T>> nVar, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final void checkWindowSizeStep(int i10, int i11) {
        String str;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> windowedIterator(@NotNull Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? EmptyIterator.INSTANCE : o.a(new AnonymousClass1(i10, i11, iterator, z11, z10, null));
    }

    @NotNull
    public static final <T> Sequence<List<T>> windowedSequence(@NotNull final Sequence<? extends T> sequence, final int i10, final int i11, final boolean z10, final boolean z11) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        checkWindowSizeStep(i10, i11);
        return new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(sequence.iterator(), i10, i11, z10, z11);
            }
        };
    }
}
