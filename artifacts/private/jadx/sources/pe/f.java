package pe;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nNetworkUtility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkUtility.kt\ncom/planner5d/library/utils/network/NetworkUtility\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,40:1\n1557#2:41\n1628#2,3:42\n142#3:45\n131#3,5:46\n*S KotlinDebug\n*F\n+ 1 NetworkUtility.kt\ncom/planner5d/library/utils/network/NetworkUtility\n*L\n16#1:41\n16#1:42,3\n31#1:45\n31#1:46,5\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f345646a = new f();

    private f() {
    }

    @Nullable
    public final String a(@NotNull URL url) {
        String strDecode;
        Intrinsics.checkNotNullParameter(url, "url");
        String userInfo = url.getUserInfo();
        if (userInfo == null || userInfo.length() == 0) {
            return null;
        }
        List<String> listSplit$default = StringsKt.split$default(userInfo, new String[]{":"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        for (String str : listSplit$default) {
            try {
                strDecode = URLDecoder.decode(str, Charsets.UTF_8.name());
            } catch (UnsupportedEncodingException e10) {
                timber.log.b.f381052a.e(e10);
                strDecode = URLDecoder.decode(str);
            }
            arrayList.add(strDecode);
        }
        String str2 = (String) arrayList.get(0);
        String str3 = (String) arrayList.get(1);
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        return o.c(str2, str3, null, 4, null);
    }

    @Nullable
    public final String b(@Nullable String str) {
        CharSequence charSequenceSubSequence;
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            char cCharAt = str.charAt(length);
            if (cCharAt != ' ' && cCharAt != '/') {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        String string = charSequenceSubSequence.toString();
        if (StringsKt.u2(string, "http", false, 2, null)) {
            string = new Regex("^https*://").replace(string, "");
        }
        return string;
    }
}
