package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class f implements d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41572c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f41574b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1}, l = {55, com.planner5d.library.engine.input.f.b.f160707m}, m = "awaitLoad", n = {io.ktor.http.m.d.f296017b}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41576b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41578d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41576b = obj;
            this.f41578d |= Integer.MIN_VALUE;
            return f.this.a(null, this);
        }
    }

    public f(@NotNull Context context) {
        this.f41573a = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r8 == r1) goto L28;
     */
    @Override // androidx.compose.ui.text.font.d1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.x r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super android.graphics.Typeface> r8) {
        /*
            r6 = this;
            java.lang.String r5 = "Androeed.ru"
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.f.a
            r5 = 2
            if (r0 == 0) goto L19
            r0 = r8
            r5 = 3
            androidx.compose.ui.text.font.f$a r0 = (androidx.compose.ui.text.font.f.a) r0
            int r1 = r0.f41578d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r5 = 4
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r5 = 1
            r0.f41578d = r1
            goto L1e
        L19:
            androidx.compose.ui.text.font.f$a r0 = new androidx.compose.ui.text.font.f$a
            r0.<init>(r8)
        L1e:
            java.lang.Object r8 = r0.f41576b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 3
            int r2 = r0.f41578d
            r5 = 0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L42
            r5 = 2
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.f41575a
            androidx.compose.ui.text.font.x r7 = (androidx.compose.ui.text.font.x) r7
            kotlin.ResultKt.m(r8)
            goto L7a
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 2
            r6.<init>(r7)
            throw r6
        L42:
            kotlin.ResultKt.m(r8)
            r5 = 3
            return r8
        L47:
            r5 = 5
            kotlin.ResultKt.m(r8)
            boolean r8 = r7 instanceof androidx.compose.ui.text.font.d
            if (r8 == 0) goto L64
            r5 = 7
            androidx.compose.ui.text.font.d r7 = (androidx.compose.ui.text.font.d) r7
            r5 = 3
            androidx.compose.ui.text.font.d$a r8 = r7.d()
            r5 = 1
            android.content.Context r6 = r6.f41573a
            r0.f41578d = r4
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L63
            goto L79
        L63:
            return r6
        L64:
            boolean r8 = r7 instanceof androidx.compose.ui.text.font.l1
            r5 = 1
            if (r8 == 0) goto L8b
            r8 = r7
            androidx.compose.ui.text.font.l1 r8 = (androidx.compose.ui.text.font.l1) r8
            android.content.Context r2 = r6.f41573a
            r0.f41575a = r7
            r0.f41578d = r3
            java.lang.Object r8 = androidx.compose.ui.text.font.g.b(r8, r2, r0)
            r5 = 1
            if (r8 != r1) goto L7a
        L79:
            return r1
        L7a:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            androidx.compose.ui.text.font.l1 r7 = (androidx.compose.ui.text.font.l1) r7
            androidx.compose.ui.text.font.u0$e r7 = r7.j()
            r5 = 6
            android.content.Context r6 = r6.f41573a
            android.graphics.Typeface r6 = androidx.compose.ui.text.font.k1.c(r8, r7, r6)
            r5 = 4
            return r6
        L8b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r5 = 4
            r8.<init>()
            java.lang.String r0 = "Unknown font type: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r5 = 2
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.f.a(androidx.compose.ui.text.font.x, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.d1
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Typeface b(@NotNull x xVar) {
        Object objM785constructorimpl;
        Typeface typefaceC;
        if (xVar instanceof d) {
            d dVar = (d) xVar;
            return dVar.d().a(this.f41573a, dVar);
        }
        Object obj = null;
        if (!(xVar instanceof l1)) {
            return null;
        }
        l1 l1Var = (l1) xVar;
        int iB = l1Var.b();
        o0.a aVar = o0.f41676b;
        if (o0.g(iB, aVar.b())) {
            typefaceC = g.c(l1Var, this.f41573a);
        } else {
            if (!o0.g(iB, aVar.c())) {
                if (o0.g(iB, aVar.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) o0.j(l1Var.b())));
            }
            try {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(g.c((l1) xVar, this.f41573a));
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            if (!Result.m786isFailureimpl(objM785constructorimpl)) {
                obj = objM785constructorimpl;
            }
            typefaceC = (Typeface) obj;
        }
        return k1.c(typefaceC, l1Var.j(), this.f41573a);
    }

    @Override // androidx.compose.ui.text.font.d1
    @Nullable
    public Object getCacheKey() {
        return this.f41574b;
    }
}
