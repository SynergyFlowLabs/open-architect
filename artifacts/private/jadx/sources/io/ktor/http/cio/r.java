package io.ktor.http.cio;

import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f295603a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f295604b = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f295605c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f295606d = 768;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f295607e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f295608f = 0.75d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f295609g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f295610h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f295611i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f295612j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f295613k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f295614l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final io.ktor.utils.io.pool.d<int[]> f295615m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final io.ktor.utils.io.pool.d<o> f295616n = new a();

    public static final class a extends io.ktor.utils.io.pool.d<o> {
        a() {
            super(1000);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public o a(o instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            instance.f();
            return (o) super.a(instance);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.d
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public o d() {
            return new o();
        }
    }

    public static final class b extends io.ktor.utils.io.pool.d<int[]> {
        b() {
            super(1000);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] a(int[] instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            ArraysKt.fill$default(instance, -1, 0, 0, 6, (Object) null);
            return (int[]) super.a(instance);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.d
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int[] d() {
            int[] iArr = new int[768];
            for (int i10 = 0; i10 < 768; i10++) {
                iArr[i10] = -1;
            }
            return iArr;
        }
    }

    public static final void c(@NotNull q qVar, @NotNull String indent, @NotNull Appendable out) throws IOException {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        Intrinsics.checkNotNullParameter(out, "out");
        Iterator<Integer> it = qVar.m().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            out.append(indent);
            out.append(qVar.l(iIntValue));
            out.append(" => ");
            out.append(qVar.t(iIntValue));
            out.append("\n");
        }
    }
}
