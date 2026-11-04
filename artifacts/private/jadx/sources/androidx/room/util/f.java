package androidx.room.util;

import androidx.annotation.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nStringUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1603#2,9:87\n1855#2:96\n1856#2:98\n1612#2:99\n1#3:97\n*S KotlinDebug\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n*L\n66#1:87,9\n66#1:96\n66#1:98\n66#1:99\n66#1:97\n*E\n"})
@oj.i(name = "StringUtil")
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String[] f75094a = new String[0];

    public static final void a(@NotNull StringBuilder builder, int i10) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i11 = 0; i11 < i10; i11++) {
            builder.append(com.planner5d.library.model.payments.a.f222474i);
            if (i11 < i10 - 1) {
                builder.append(",");
            }
        }
    }

    public static /* synthetic */ void b() {
    }

    @Nullable
    public static final String c(@Nullable List<Integer> list) {
        if (list != null) {
            return CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    @NotNull
    public static final StringBuilder d() {
        return new StringBuilder();
    }

    @Nullable
    public static final List<Integer> e(@Nullable String str) {
        List listT4;
        Integer numValueOf;
        if (str == null || (listT4 = StringsKt.T4(str, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listT4.iterator();
        while (it.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }
}
