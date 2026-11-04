package io.ktor.http.cio;

import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpHeadersMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHeadersMap.kt\nio/ktor/http/cio/HttpHeadersMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.cio.internals.d f295594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f295595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f295596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private o f295597d;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.HttpHeadersMap$getAll$1", f = "HttpHeadersMap.kt", i = {0, 0}, l = {90}, m = "invokeSuspend", n = {"$this$sequence", "headerIndex"}, s = {"L$0", "I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super CharSequence>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f295599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f295600c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f295602e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f295602e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = q.this.new a(this.f295602e, dVar);
            aVar.f295600c = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0062  */
        /* JADX WARN: Code duplicated, block: B:19:0x0081 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0095 A[LOOP:0: B:13:0x0052->B:23:0x0095, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:26:0x006d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x00a1 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007f -> B:20:0x0082). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f295599b
                r2 = -1
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 != r3) goto L19
                r7 = 1
                int r1 = r8.f295598a
                java.lang.Object r4 = r8.f295600c
                r7 = 1
                kotlin.sequences.n r4 = (kotlin.sequences.n) r4
                r7 = 5
                kotlin.ResultKt.m(r9)
                goto L82
            L19:
                r7 = 6
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r7 = 7
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                r7 = 2
                throw r8
            L24:
                kotlin.ResultKt.m(r9)
                r7 = 3
                java.lang.Object r9 = r8.f295600c
                kotlin.sequences.n r9 = (kotlin.sequences.n) r9
                io.ktor.http.cio.q r1 = io.ktor.http.cio.q.this
                int r1 = r1.h()
                r7 = 1
                if (r1 != 0) goto L3a
                r7 = 1
                kotlin.Unit r8 = kotlin.Unit.f312394a
                r7 = 6
                return r8
            L3a:
                java.lang.String r1 = r8.f295602e
                r4 = 3
                r5 = 0
                r6 = 0
                int r1 = io.ktor.http.cio.internals.i.j(r1, r6, r6, r4, r5)
                r7 = 6
                int r1 = java.lang.Math.abs(r1)
                io.ktor.http.cio.q r4 = io.ktor.http.cio.q.this
                r7 = 5
                int r4 = io.ktor.http.cio.q.a(r4)
                r7 = 3
                int r1 = r1 % r4
                r4 = r9
            L52:
                io.ktor.http.cio.q r9 = io.ktor.http.cio.q.this
                io.ktor.http.cio.o r9 = io.ktor.http.cio.q.b(r9)
                r7 = 4
                int r5 = r1 * 6
                r7 = 2
                int r9 = r9.c(r5)
                if (r9 == r2) goto La1
                io.ktor.http.cio.q r9 = io.ktor.http.cio.q.this
                java.lang.String r6 = r8.f295602e
                r7 = 7
                boolean r9 = io.ktor.http.cio.q.c(r9, r6, r5)
                if (r9 == 0) goto L95
                io.ktor.http.cio.q r9 = io.ktor.http.cio.q.this
                java.lang.CharSequence r9 = r9.t(r5)
                r8.f295600c = r4
                r7 = 5
                r8.f295598a = r1
                r7 = 2
                r8.f295599b = r3
                java.lang.Object r9 = r4.b(r9, r8)
                if (r9 != r0) goto L82
                return r0
            L82:
                io.ktor.http.cio.q r9 = io.ktor.http.cio.q.this
                io.ktor.http.cio.o r9 = io.ktor.http.cio.q.b(r9)
                int r1 = r1 * 6
                r7 = 1
                int r1 = r1 + 5
                int r1 = r9.c(r1)
                r7 = 0
                if (r1 == r2) goto La1
                goto L52
            L95:
                int r1 = r1 + 1
                r7 = 2
                io.ktor.http.cio.q r9 = io.ktor.http.cio.q.this
                r7 = 6
                int r9 = io.ktor.http.cio.q.a(r9)
                int r1 = r1 % r9
                goto L52
            La1:
                r7 = 1
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super CharSequence> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public q(@NotNull io.ktor.http.cio.internals.d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f295594a = builder;
        this.f295597d = (o) r.f295616n.Jc();
    }

    public static /* synthetic */ int e(q qVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return qVar.d(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(CharSequence charSequence, int i10) {
        return io.ktor.http.cio.internals.i.e(this.f295594a, this.f295597d.c(i10 + 1), this.f295597d.c(i10 + 2), charSequence);
    }

    private final int j(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 < this.f295595b) {
            return ((Number) kotlin.sequences.o.f1(kotlin.sequences.o.Y2(m(), i10 + 1))).intValue();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private final void q() {
        int i10 = this.f295595b;
        o oVar = this.f295597d;
        this.f295595b = 0;
        this.f295596c = (this.f295596c * 2) | 128;
        o oVar2 = (o) r.f295616n.Jc();
        oVar2.e((oVar.b() * 2) | 1);
        this.f295597d = oVar2;
        Iterator<Integer> it = oVar.d().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            n(oVar.c(iIntValue + 1), oVar.c(iIntValue + 2), oVar.c(iIntValue + 3), oVar.c(iIntValue + 4));
        }
        r.f295616n.h8(oVar);
        if (i10 != this.f295595b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final boolean r() {
        return ((double) this.f295595b) >= ((double) this.f295596c) * 0.75d;
    }

    @kotlin.l(message = "Use getAll instead", replaceWith = @b1(expression = "getAll(name)", imports = {}))
    public final int d(@NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f295595b == 0) {
            return -1;
        }
        int iJ = j(i10);
        while (this.f295597d.c(iJ) != -1) {
            if (i(name, iJ)) {
                return i10;
            }
            i10++;
            iJ = (iJ / 6) % this.f295596c;
        }
        return -1;
    }

    @Nullable
    public final CharSequence f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f295595b == 0) {
            return null;
        }
        int iAbs = Math.abs(io.ktor.http.cio.internals.i.j(name, 0, 0, 3, null));
        int i10 = this.f295596c;
        while (true) {
            int i11 = iAbs % i10;
            int i12 = i11 * 6;
            if (this.f295597d.c(i12) == -1) {
                return null;
            }
            if (i(name, i12)) {
                return t(i12);
            }
            iAbs = i11 + 1;
            i10 = this.f295596c;
        }
    }

    @NotNull
    public final Sequence<CharSequence> g(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return kotlin.sequences.o.b(new a(name, null));
    }

    public final int h() {
        return this.f295595b;
    }

    @kotlin.l(message = "Use nameAtOffset instead", replaceWith = @b1(expression = "nameAtOffset", imports = {}))
    @NotNull
    public final CharSequence k(int i10) {
        return l(j(i10));
    }

    @NotNull
    public final CharSequence l(int i10) {
        return this.f295594a.subSequence(this.f295597d.c(i10 + 1), this.f295597d.c(i10 + 2));
    }

    @NotNull
    public final Sequence<Integer> m() {
        return this.f295597d.d();
    }

    public final void n(int i10, int i11, int i12, int i13) {
        int i14;
        if (r()) {
            q();
        }
        int iAbs = Math.abs(io.ktor.http.cio.internals.i.i(this.f295594a, i10, i11));
        CharSequence charSequenceSubSequence = this.f295594a.subSequence(i10, i11);
        int i15 = iAbs % this.f295596c;
        int i16 = -1;
        while (true) {
            i14 = i15 * 6;
            if (this.f295597d.c(i14) == -1) {
                break;
            }
            if (i(charSequenceSubSequence, i14)) {
                i16 = i15;
            }
            i15 = (i15 + 1) % this.f295596c;
        }
        this.f295597d.g(i14, iAbs);
        this.f295597d.g(i14 + 1, i10);
        this.f295597d.g(i14 + 2, i11);
        this.f295597d.g(i14 + 3, i12);
        this.f295597d.g(i14 + 4, i13);
        this.f295597d.g(i14 + 5, -1);
        if (i16 != -1) {
            this.f295597d.g((i16 * 6) + 5, i15);
        }
        this.f295595b++;
    }

    @kotlin.l(message = "Use put without `nameHash` and `valueHash` instead", replaceWith = @b1(expression = "put(nameStartIndex, nameEndIndex, valueStartIndex, valueEndIndex)", imports = {}))
    public final void o(int i10, int i11, int i12, int i13, int i14, int i15) {
        n(i12, i13, i14, i15);
    }

    public final void p() {
        this.f295595b = 0;
        this.f295596c = 0;
        r.f295616n.h8(this.f295597d);
        this.f295597d = (o) r.f295616n.Jc();
    }

    @kotlin.l(message = "Use valueAtOffset instead", replaceWith = @b1(expression = "valueAtOffset", imports = {}))
    @NotNull
    public final CharSequence s(int i10) {
        return t(j(i10));
    }

    @NotNull
    public final CharSequence t(int i10) {
        return this.f295594a.subSequence(this.f295597d.c(i10 + 3), this.f295597d.c(i10 + 4));
    }

    @NotNull
    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        r.c(this, "", sb2);
        return sb2.toString();
    }
}
