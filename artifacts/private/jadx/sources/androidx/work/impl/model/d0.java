package androidx.work.impl.model;

import android.net.Uri;
import android.os.Build;
import androidx.room.s2;
import androidx.work.l0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f76918a = new d0();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f76919a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f76920b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f76921c = 1;

        private a() {
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f76922a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f76923b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f76924c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f76925d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f76926e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f76927f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f76928g = 5;

        private b() {
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f76929a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f76930b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f76931c = 1;

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f76932a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f76933b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f76934c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f76935d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f76936e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f76937f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f76938g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f76939h = "(2, 3, 5)";

        private d() {
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f76941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f76942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f76943d;

        static {
            int[] iArr = new int[l0.c.values().length];
            try {
                iArr[l0.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l0.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l0.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l0.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l0.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l0.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f76940a = iArr;
            int[] iArr2 = new int[androidx.work.a.values().length];
            try {
                iArr2[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f76941b = iArr2;
            int[] iArr3 = new int[androidx.work.w.values().length];
            try {
                iArr3[androidx.work.w.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[androidx.work.w.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[androidx.work.w.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[androidx.work.w.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[androidx.work.w.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f76942c = iArr3;
            int[] iArr4 = new int[androidx.work.c0.values().length];
            try {
                iArr4[androidx.work.c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[androidx.work.c0.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f76943d = iArr4;
        }
    }

    private d0() {
    }

    @oj.n
    @s2
    public static final int a(@NotNull androidx.work.a backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i10 = e.f76941b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new k0();
    }

    @oj.n
    @s2
    @NotNull
    public static final Set<androidx.work.e.c> b(@NotNull byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        linkedHashSet.add(new androidx.work.e.c(uri, z10));
                    }
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(objectInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            Unit unit2 = Unit.f312394a;
            kotlin.io.c.a(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                kotlin.io.c.a(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    @oj.n
    @s2
    @NotNull
    public static final androidx.work.a c(int i10) {
        if (i10 == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    @oj.n
    @s2
    @NotNull
    public static final androidx.work.w d(int i10) {
        if (i10 == 0) {
            return androidx.work.w.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return androidx.work.w.CONNECTED;
        }
        if (i10 == 2) {
            return androidx.work.w.UNMETERED;
        }
        if (i10 == 3) {
            return androidx.work.w.NOT_ROAMING;
        }
        if (i10 == 4) {
            return androidx.work.w.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return androidx.work.w.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    @oj.n
    @s2
    @NotNull
    public static final androidx.work.c0 e(int i10) {
        if (i10 == 0) {
            return androidx.work.c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return androidx.work.c0.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    @oj.n
    @s2
    @NotNull
    public static final l0.c f(int i10) {
        if (i10 == 0) {
            return l0.c.ENQUEUED;
        }
        if (i10 == 1) {
            return l0.c.RUNNING;
        }
        if (i10 == 2) {
            return l0.c.SUCCEEDED;
        }
        if (i10 == 3) {
            return l0.c.FAILED;
        }
        if (i10 == 4) {
            return l0.c.BLOCKED;
        }
        if (i10 == 5) {
            return l0.c.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    @oj.n
    @s2
    public static final int g(@NotNull androidx.work.w networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i10 = e.f76942c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.w.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @oj.n
    @s2
    public static final int h(@NotNull androidx.work.c0 policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i10 = e.f76943d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new k0();
    }

    @oj.n
    @s2
    @NotNull
    public static final byte[] i(@NotNull Set<androidx.work.e.c> triggers) throws IOException {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (androidx.work.e.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.a().toString());
                    objectOutputStream.writeBoolean(cVar.b());
                }
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(objectOutputStream, null);
                kotlin.io.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                kotlin.io.c.a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    @oj.n
    @s2
    public static final int j(@NotNull l0.c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (e.f76940a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new k0();
        }
    }
}
