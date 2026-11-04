package coil.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHardwareBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/LimitedFileDescriptorHardwareBitmapService\n+ 2 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,215:1\n57#2:216\n57#2:217\n*S KotlinDebug\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/LimitedFileDescriptorHardwareBitmapService\n*L\n45#1:216\n46#1:217\n*E\n"})
final class y implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f87881b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f87882c = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final z f87883a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public y(@Nullable z zVar) {
        this.f87883a = zVar;
    }

    @Override // coil.util.v
    public boolean a(@NotNull coil.size.i iVar) {
        coil.size.c cVarF = iVar.f();
        if ((cVarF instanceof coil.size.c.a ? ((coil.size.c.a) cVarF).f87767a : Integer.MAX_VALUE) > 100) {
            coil.size.c cVarE = iVar.e();
            if ((cVarE instanceof coil.size.c.a ? ((coil.size.c.a) cVarE).f87767a : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.util.v
    public boolean b() {
        return u.f87866a.b(this.f87883a);
    }
}
