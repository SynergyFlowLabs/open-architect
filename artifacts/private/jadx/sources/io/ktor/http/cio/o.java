package io.ktor.http.cio;

import com.google.android.material.internal.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private List<int[]> f295586a = new ArrayList();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.HeadersData$headersStarts$1", f = "HttpHeadersMap.kt", i = {0, 0, 0, 0}, l = {264}, m = "invokeSuspend", n = {"$this$sequence", "arr", "joinedIndex", "localIndex"}, s = {"L$0", "L$2", "I$0", "I$1"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super Integer>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f295591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f295592f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = o.this.new a(dVar);
            aVar.f295592f = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
        /* JADX WARN: Code duplicated, block: B:23:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:13:0x005a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0067 -> B:22:0x008f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:21:0x0087). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f295591e
                r2 = 0
                r9 = 6
                r3 = 1
                if (r1 == 0) goto L2f
                r9 = 0
                if (r1 != r3) goto L24
                int r1 = r10.f295590d
                int r4 = r10.f295589c
                java.lang.Object r5 = r10.f295588b
                int[] r5 = (int[]) r5
                java.lang.Object r6 = r10.f295587a
                java.util.Iterator r6 = (java.util.Iterator) r6
                r9 = 2
                java.lang.Object r7 = r10.f295592f
                kotlin.sequences.n r7 = (kotlin.sequences.n) r7
                kotlin.ResultKt.m(r11)
                r9 = 7
                goto L87
            L24:
                r9 = 5
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "n/s  // evsm/relrcktieeuroe/cooo/ibn uhfiotw t/ea l"
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L2f:
                kotlin.ResultKt.m(r11)
                r9 = 2
                java.lang.Object r11 = r10.f295592f
                kotlin.sequences.n r11 = (kotlin.sequences.n) r11
                io.ktor.http.cio.o r1 = io.ktor.http.cio.o.this
                r9 = 5
                java.util.List r1 = io.ktor.http.cio.o.a(r1)
                r9 = 7
                java.util.Iterator r1 = r1.iterator()
                r9 = 1
                r4 = r2
                r4 = r2
            L46:
                boolean r5 = r1.hasNext()
                r9 = 7
                if (r5 == 0) goto L9a
                r9 = 4
                java.lang.Object r5 = r1.next()
                int[] r5 = (int[]) r5
                r6 = r5
                r9 = 6
                r5 = r4
                r4 = r1
                r9 = 4
                r1 = r2
            L5a:
                r9 = 0
                int r7 = r6.length
                r9 = 0
                if (r1 >= r7) goto L94
                r9 = 7
                io.ktor.http.cio.o r7 = io.ktor.http.cio.o.this
                int r7 = r7.c(r5)
                r8 = -1
                if (r7 == r8) goto L8f
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.f(r5)
                r9 = 6
                r10.f295592f = r11
                r10.f295587a = r4
                r10.f295588b = r6
                r10.f295589c = r5
                r10.f295590d = r1
                r10.f295591e = r3
                java.lang.Object r7 = r11.b(r7, r10)
                if (r7 != r0) goto L81
                return r0
            L81:
                r7 = r6
                r6 = r4
                r9 = 6
                r4 = r5
                r5 = r7
                r7 = r11
            L87:
                r11 = r5
                r9 = 2
                r5 = r4
                r4 = r6
                r6 = r11
                r6 = r11
                r11 = r7
                r11 = r7
            L8f:
                int r1 = r1 + 6
                int r5 = r5 + 6
                goto L5a
            L94:
                r1 = r4
                r1 = r4
                r9 = 2
                r4 = r5
                r4 = r5
                goto L46
            L9a:
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super Integer> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public final int b() {
        return this.f295586a.size();
    }

    public final int c(int i10) {
        return this.f295586a.get(i10 / p0.f112892a)[i10 % p0.f112892a];
    }

    @NotNull
    public final Sequence<Integer> d() {
        return kotlin.sequences.o.b(new a(null));
    }

    public final void e(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f295586a.add((int[]) r.f295615m.Jc());
        }
    }

    public final void f() {
        Iterator<int[]> it = this.f295586a.iterator();
        while (it.hasNext()) {
            r.f295615m.h8(it.next());
        }
        this.f295586a.clear();
    }

    public final void g(int i10, int i11) {
        this.f295586a.get(i10 / p0.f112892a)[i10 % p0.f112892a] = i11;
    }
}
