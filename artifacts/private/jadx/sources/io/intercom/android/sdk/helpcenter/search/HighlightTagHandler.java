package io.intercom.android.sdk.helpcenter.search;

import android.text.Editable;
import android.text.Html;
import android.text.style.StyleSpan;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class HighlightTagHandler implements Html.TagHandler {
    private static final int SPAN_FLAG = 33;
    private int endIndex;
    private int startIndex;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void applyColorSpan(Editable editable) {
        editable.setSpan(new StyleSpan(1), this.startIndex, this.endIndex, 33);
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z10, @NotNull String tag, @NotNull Editable output, @NotNull XMLReader xmlReader) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(xmlReader, "xmlReader");
        if (StringsKt.N1(tag, "highlight", true)) {
            if (z10) {
                this.startIndex = output.length();
            } else {
                this.endIndex = output.length();
                applyColorSpan(output);
            }
        }
    }
}
