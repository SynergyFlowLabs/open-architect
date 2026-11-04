package u5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.annotation.l1;
import com.planner5d.library.services.utility.e0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f381181a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f381182b = ":";

    private a() {
    }

    @n
    @NotNull
    public static final String a(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Signature[] signatures = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance(e0.f225194b);
            Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
            int length = signatures.length;
            int i10 = 0;
            while (i10 < length) {
                Signature signature = signatures[i10];
                i10++;
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    @l1(otherwise = 2)
    public static /* synthetic */ void b() {
    }
}
