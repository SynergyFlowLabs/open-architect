package coil.decode;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<String> f87176a = SetsKt.setOf((Object[]) new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"});

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87177a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87177a = iArr;
        }
    }

    public static final boolean a(@NotNull i iVar) {
        return iVar.a() > 0;
    }

    public static final boolean b(@NotNull i iVar) {
        return iVar.a() == 90 || iVar.a() == 270;
    }

    public static final boolean c(@NotNull k kVar, @Nullable String str) {
        int i10 = a.f87177a[kVar.ordinal()];
        int i11 = 2 >> 0;
        if (i10 == 1) {
            return str != null && f87176a.contains(str);
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        throw new k0();
    }
}
