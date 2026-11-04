package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.lib.VideoProvider;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class VideoUrlUtilKt {

    @NotNull
    private static final String ID_SEPARATOR = "|";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            try {
                iArr[VideoProvider.YOUTUBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoProvider.VIMEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoProvider.VIDYARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoProvider.BRIGHTCOVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoProvider.JWPLAYER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoProvider.MICROSOFTSTREAM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoProvider.SYNTHESIA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoProvider.GUIDDE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VideoProvider.DESCRIPT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VideoProvider.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getEmbedUrl(@NotNull VideoProvider provider, @NotNull String joinedIds) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(joinedIds, "joinedIds");
        List listSplit$default = StringsKt.split$default(joinedIds, new String[]{ID_SEPARATOR}, false, 0, 6, null);
        String str = (String) CollectionsKt.first(listSplit$default);
        List listDrop = CollectionsKt.drop(listSplit$default, 1);
        switch (WhenMappings.$EnumSwitchMapping$0[provider.ordinal()]) {
            case 1:
                return "https://www.youtube.com/embed/" + str + "?rel=0";
            case 2:
                if (listDrop.isEmpty()) {
                    return "https://player.vimeo.com/video/" + str;
                }
                return "https://player.vimeo.com/video/" + str + "?h=" + ((String) listDrop.get(0));
            case 3:
                return "https://fast.wistia.net/embed/iframe/" + str;
            case 4:
                return "https://www.loom.com/embed/" + str;
            case 5:
                return "https://play.vidyard.com/" + str;
            case 6:
                return "https://players.brightcove.net/" + str + "/default_default/index.html?videoId=" + ((String) listDrop.get(0));
            case 7:
                return "https://content.jwplatform.com/players/" + str + ".html";
            case 8:
                if (listDrop.isEmpty()) {
                    return "https://web.microsoftstream.com/embed/video/" + str;
                }
                return "https://" + str + ".sharepoint.com/:v:/" + ((String) listDrop.get(0));
            case 9:
                return "https://share.synthesia.io/embeds/videos/" + str;
            case 10:
                return "https://embed.app.guidde.com/playbooks/" + str;
            case 11:
                return "https://share.descript.com/embed/" + str;
            case 12:
                return "";
            default:
                throw new k0();
        }
    }
}
