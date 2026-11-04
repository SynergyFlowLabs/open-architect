package io.ktor.client.request.forms;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.http.content.w;
import io.ktor.http.d1;
import io.ktor.http.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.io.c0;
import kotlinx.io.g0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nFormDataContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormDataContent.kt\nio/ktor/client/request/forms/MultiPartFormDataContent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,170:1\n1563#2:171\n1634#2,2:172\n1636#2:177\n21#3,3:174\n21#3,3:178\n*S KotlinDebug\n*F\n+ 1 FormDataContent.kt\nio/ktor/client/request/forms/MultiPartFormDataContent\n*L\n60#1:171\n60#1:172,2\n60#1:177\n80#1:174,3\n81#1:178,3\n*E\n"})
public final class t extends w.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f295300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.m f295301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final byte[] f295302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final byte[] f295303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f295304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f295305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<u> f295306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Long f295307i;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5, 6}, l = {124, 125, okhttp3.internal.ws.g.f334652s, 131, 135, 139, androidx.media2.widget.f.i.f59777h0, 146, 146, 146}, m = "writeTo", n = {AppsFlyerProperties.CHANNEL, "part", AppsFlyerProperties.CHANNEL, "part", AppsFlyerProperties.CHANNEL, "part", AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$0", "L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f295311d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f295313f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295311d = obj;
            this.f295313f |= Integer.MIN_VALUE;
            return t.this.h(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t(List list, String str, io.ktor.http.m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 2) != 0 ? g.e() : str;
        this(list, str, (i10 & 4) != 0 ? io.ktor.http.m.g.f296037a.g().j("boundary", str) : mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 k(byte[] bArr) {
        kotlinx.io.b bVar = new kotlinx.io.b();
        ui.j.i(bVar, bArr, 0, 0, 6, null);
        return bVar;
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public Long a() {
        return this.f295307i;
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public io.ktor.http.m b() {
        return this.f295301c;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d0 A[Catch: all -> 0x01c7, TRY_LEAVE, TryCatch #4 {all -> 0x01c7, blocks: (B:47:0x00ca, B:49:0x00d0, B:100:0x01cc), top: B:128:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0169 A[Catch: all -> 0x0098, TryCatch #5 {all -> 0x0098, blocks: (B:63:0x0136, B:65:0x013a, B:70:0x015d, B:77:0x0169, B:79:0x016d, B:90:0x01ae, B:91:0x01b3, B:75:0x0165, B:76:0x0168, B:34:0x0093, B:39:0x00a7, B:42:0x00b7, B:66:0x0147, B:69:0x015b, B:29:0x007d, B:73:0x0163), top: B:130:0x0027, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x016d A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #5 {all -> 0x0098, blocks: (B:63:0x0136, B:65:0x013a, B:70:0x015d, B:77:0x0169, B:79:0x016d, B:90:0x01ae, B:91:0x01b3, B:75:0x0165, B:76:0x0168, B:34:0x0093, B:39:0x00a7, B:42:0x00b7, B:66:0x0147, B:69:0x015b, B:29:0x007d, B:73:0x0163), top: B:130:0x0027, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x018a  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0060: MOVE (r7 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:24:0x0060 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01a7 -> B:22:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.ktor.http.content.w.f
    @org.jetbrains.annotations.Nullable
    public java.lang.Object h(@org.jetbrains.annotations.NotNull io.ktor.utils.io.p r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.request.forms.t.h(io.ktor.utils.io.p, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public final String j() {
        return this.f295300b;
    }

    public t(@NotNull List<? extends io.ktor.http.content.c0> parts, @NotNull String boundary, @NotNull io.ktor.http.m contentType) {
        Object aVar;
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f295300b = boundary;
        this.f295301c = contentType;
        Long l10 = null;
        byte[] bArrM = ui.u.m("--" + boundary + "\r\n", null, 1, null);
        this.f295302d = bArrM;
        byte[] bArrM2 = ui.u.m("--" + boundary + "--\r\n", null, 1, null);
        this.f295303e = bArrM2;
        this.f295304f = bArrM2.length;
        this.f295305g = (g.f295289a.length * 2) + bArrM.length;
        List<? extends io.ktor.http.content.c0> list = parts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (io.ktor.http.content.c0 c0Var : list) {
            x xVarA = ui.j.a();
            for (Map.Entry<String, List<String>> entry : c0Var.h().k()) {
                ui.u.p(xVarA, entry.getKey() + ": " + CollectionsKt.joinToString$default(entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, null, 14, null);
                ui.j.i(xVarA, g.f295289a, 0, 0, 6, null);
            }
            v0 v0VarH = c0Var.h();
            d1 d1Var = d1.f295782a;
            String str = v0VarH.get(d1Var.z());
            Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            if (c0Var instanceof io.ktor.http.content.c0.c) {
                byte[] bArrC = g0.c(ui.j.e(xVarA));
                aVar = new u.a(bArrC, ((io.ktor.http.content.c0.c) c0Var).k(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + ((long) this.f295305g) + ((long) bArrC.length)) : null);
            } else if (c0Var instanceof io.ktor.http.content.c0.b) {
                byte[] bArrC2 = g0.c(ui.j.e(xVarA));
                aVar = new u.b(bArrC2, ((io.ktor.http.content.c0.b) c0Var).j(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + ((long) this.f295305g) + ((long) bArrC2.length)) : null);
            } else if (c0Var instanceof io.ktor.http.content.c0.d) {
                kotlinx.io.b bVar = new kotlinx.io.b();
                ui.u.p(bVar, ((io.ktor.http.content.c0.d) c0Var).j(), 0, 0, null, 14, null);
                final byte[] bArrC3 = g0.c(bVar);
                Function0 function0 = new Function0() { // from class: io.ktor.client.request.forms.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t.k(bArrC3);
                    }
                };
                if (lValueOf == null) {
                    ui.u.p(xVarA, d1Var.z() + ": " + bArrC3.length, 0, 0, null, 14, null);
                    ui.j.i(xVarA, g.f295289a, 0, 0, 6, null);
                }
                byte[] bArrC4 = g0.c(ui.j.e(xVarA));
                aVar = new u.b(bArrC4, function0, Long.valueOf(bArrC3.length + this.f295305g + bArrC4.length));
            } else if (c0Var instanceof io.ktor.http.content.c0.a) {
                byte[] bArrC5 = g0.c(ui.j.e(xVarA));
                aVar = new u.a(bArrC5, ((io.ktor.http.content.c0.a) c0Var).l(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + ((long) this.f295305g) + ((long) bArrC5.length)) : null);
            } else {
                throw new k0();
            }
            arrayList.add(aVar);
        }
        this.f295306h = arrayList;
        Long lValueOf2 = 0L;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                l10 = lValueOf2;
                break;
            }
            Long lB = ((u) it.next()).b();
            if (lB == null) {
                break;
            } else {
                lValueOf2 = lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + lB.longValue()) : null;
            }
        }
        this.f295307i = l10 != null ? Long.valueOf(l10.longValue() + ((long) this.f295304f)) : l10;
    }
}
