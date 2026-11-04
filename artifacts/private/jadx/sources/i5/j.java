package i5;

import android.text.TextUtils;
import androidx.annotation.b1;
import com.facebook.g0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f287037a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f287038b = "facebook_ml/";

    private j() {
    }

    @n
    @Nullable
    public static final File a() {
        if (com.facebook.internal.instrument.crashshield.b.e(j.class)) {
            return null;
        }
        try {
            g0 g0Var = g0.f99617a;
            File file = new File(g0.n().getFilesDir(), f287038b);
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, j.class);
            return null;
        }
    }

    @n
    @Nullable
    public static final Map<String, a> c(@NotNull File file) {
        Map<String, a> map;
        Map<String, a> map2 = null;
        if (com.facebook.internal.instrument.crashshield.b.e(j.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                int i10 = 0;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i11 = byteBufferWrap.getInt();
                int i12 = i11 + 4;
                if (iAvailable < i12) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i11, Charsets.UTF_8));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                int i13 = length - 1;
                if (i13 >= 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        strArr[i14] = jSONArrayNames.getString(i14);
                        if (i15 > i13) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                ArraysKt.sort((Object[]) strArr);
                HashMap map3 = new HashMap();
                int i16 = 0;
                while (i16 < length) {
                    String str = strArr[i16];
                    i16++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i17 = length2 - 1;
                        int i18 = 1;
                        map = map2;
                        if (i17 >= 0) {
                            int i19 = i10;
                            while (true) {
                                int i20 = i19 + 1;
                                try {
                                    int i21 = jSONArray.getInt(i19);
                                    iArr[i19] = i21;
                                    i18 *= i21;
                                    if (i20 > i17) {
                                        break;
                                    }
                                    i19 = i20;
                                } catch (Exception unused) {
                                    return map;
                                } catch (Throwable th2) {
                                    th = th2;
                                    com.facebook.internal.instrument.crashshield.b.c(th, j.class);
                                    return map;
                                }
                            }
                        }
                        int i22 = i18 * 4;
                        int i23 = i12 + i22;
                        if (i23 > iAvailable) {
                            return map;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i12, i22);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        a aVar = new a(iArr);
                        byteBufferWrap2.asFloatBuffer().get(aVar.a(), 0, i18);
                        map3.put(str, aVar);
                        i12 = i23;
                        i10 = 0;
                        map2 = map;
                    }
                }
                return map3;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th3) {
            th = th3;
            map = map2;
        }
    }

    @NotNull
    public final String b(@NotNull String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            Object[] array = new Regex("\\s+").o(str.subSequence(i10, length + 1).toString(), 0).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String strJoin = TextUtils.join(" ", (String[]) array);
            Intrinsics.checkNotNullExpressionValue(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @NotNull
    public final int[] d(@NotNull String texts, int i10) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[i10];
            String strB = b(texts);
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
            if (strB == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = strB.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            if (i10 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (i11 < bytes.length) {
                        iArr[i11] = bytes[i11] & 255;
                    } else {
                        iArr[i11] = 0;
                    }
                    if (i12 >= i10) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }
}
