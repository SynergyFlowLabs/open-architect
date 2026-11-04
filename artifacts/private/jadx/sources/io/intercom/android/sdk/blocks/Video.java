package io.intercom.android.sdk.blocks;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.annotation.l1;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
import java.io.IOException;
import okhttp3.e;
import okhttp3.f;
import okhttp3.f0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
class Video implements VideoBlock {
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;
    private final Twig twig = LumberMill.getLogger();

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$2, reason: invalid class name */
    class AnonymousClass2 implements f {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        AnonymousClass2(VideoPreviewView videoPreviewView, ImageView imageView, String str) {
            this.val$previewView = videoPreviewView;
            this.val$videoImageView = imageView;
            this.val$id = str;
        }

        @Override // okhttp3.f
        public void onFailure(e eVar, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.f
        public void onResponse(e eVar, f0 f0Var) {
            if (f0Var.isSuccessful()) {
                try {
                    if (f0Var.r() != null) {
                        try {
                            final String string = new JSONArray(f0Var.r().string()).getJSONObject(0).getString("thumbnail_large");
                            ImageView imageView = this.val$videoImageView;
                            final VideoPreviewView videoPreviewView = this.val$previewView;
                            final String str = this.val$id;
                            imageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Video.AnonymousClass2 anonymousClass2 = this.f291525a;
                                    Video.this.createThumbnail(videoPreviewView, "https://player.vimeo.com/video/" + str, string);
                                }
                            });
                            f0Var.r().close();
                        } catch (IOException e10) {
                            Video.this.twig.internal("ErrorObject", "Couldn't read response body: " + e10.getMessage());
                            f0Var.r().close();
                        } catch (JSONException e11) {
                            e11.printStackTrace();
                            f0Var.r().close();
                        }
                    }
                } catch (Throwable th2) {
                    f0Var.r().close();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$3, reason: invalid class name */
    class AnonymousClass3 implements f {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        AnonymousClass3(VideoPreviewView videoPreviewView, String str, ImageView imageView) {
            this.val$previewView = videoPreviewView;
            this.val$id = str;
            this.val$videoImageView = imageView;
        }

        @Override // okhttp3.f
        public void onFailure(e eVar, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.f
        public void onResponse(e eVar, f0 f0Var) {
            if (!f0Var.isSuccessful()) {
                this.val$previewView.showFailedImage();
                return;
            }
            final String str = "https://www.useloom.com/embed/" + this.val$id;
            final String thumbnailUrlFromOembedResponse = Video.this.getThumbnailUrlFromOembedResponse(f0Var);
            ImageView imageView = this.val$videoImageView;
            final VideoPreviewView videoPreviewView = this.val$previewView;
            imageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.c
                @Override // java.lang.Runnable
                public final void run() {
                    Video.this.createThumbnail(videoPreviewView, str, thumbnailUrlFromOembedResponse);
                }
            });
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider = iArr;
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.YOUTUBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.VIMEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    Video(StyleType styleType, Api api, Provider<AppConfig> provider) {
        this.style = styleType;
        this.api = api;
        this.appConfigProvider = provider;
    }

    private void addClickListenerOnThumbnailView(final ImageView imageView, final String str) {
        if (this.style != StyleType.CHAT_FULL) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.Video.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    IntentUtils.safelyOpenIntent(imageView.getContext(), intent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getThumbnailUrlFromOembedResponse(f0 f0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                JSONObject jSONObject2 = new JSONObject(f0Var.r().string());
                f0Var.r().close();
                jSONObject = jSONObject2;
            } catch (IOException e10) {
                this.twig.internal("ErrorObject", "Couldn't read response body: " + e10.getMessage());
                f0Var.r().close();
            } catch (JSONException e11) {
                e11.printStackTrace();
                f0Var.r().close();
            }
            String strOptString = jSONObject.optString("thumbnail_url");
            int iIndexOf = strOptString.indexOf("?image_crop_resized");
            if (iIndexOf > 0) {
                strOptString = strOptString.substring(0, iIndexOf);
            }
            return strOptString;
        } catch (Throwable th2) {
            f0Var.r().close();
            throw th2;
        }
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock
    public View addVideo(String str, VideoProvider videoProvider, String str2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        WebView webView = new WebView(viewGroup.getContext());
        BlockUtils.createLayoutParams(webView, -1, 480);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(VideoUrlUtilKt.getEmbedUrl(videoProvider, str2));
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void createThumbnail(VideoPreviewView videoPreviewView, String str, String str2) {
        videoPreviewView.displayThumbnail(str2);
        addClickListenerOnThumbnailView(videoPreviewView.getThumbnailImageView(), str);
    }

    @l1
    void fetchThumbnail(VideoProvider videoProvider, final String str, final VideoPreviewView videoPreviewView) {
        final ImageView thumbnailImageView = videoPreviewView.getThumbnailImageView();
        int i10 = AnonymousClass5.$SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[videoProvider.ordinal()];
        if (i10 == 1) {
            this.api.getVideo("https://fast.wistia.com/oembed?url=https://home.wistia.com/medias/" + str, new f() { // from class: io.intercom.android.sdk.blocks.Video.1
                @Override // okhttp3.f
                public void onFailure(e eVar, IOException iOException) {
                    videoPreviewView.showFailedImage();
                }

                @Override // okhttp3.f
                public void onResponse(e eVar, f0 f0Var) {
                    if (!f0Var.isSuccessful()) {
                        videoPreviewView.showFailedImage();
                        return;
                    }
                    final String str2 = "https://fast.wistia.net/embed/iframe/" + str;
                    final String thumbnailUrlFromOembedResponse = Video.this.getThumbnailUrlFromOembedResponse(f0Var);
                    thumbnailImageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Video.this.createThumbnail(videoPreviewView, str2, thumbnailUrlFromOembedResponse);
                        }
                    });
                }
            });
            return;
        }
        if (i10 == 2) {
            createThumbnail(videoPreviewView, "https://www.youtube.com/watch?v=" + str, "https://img.youtube.com/vi/" + str + "/default.jpg");
            return;
        }
        if (i10 == 3) {
            this.api.getVideo("https://vimeo.com/api/v2/video/" + str + ".json", new AnonymousClass2(videoPreviewView, thumbnailImageView, str));
            return;
        }
        if (i10 != 4) {
            return;
        }
        this.api.getVideo("https://www.useloom.com/v1/oembed?url=https://www.useloom.com/embed/" + str, new AnonymousClass3(videoPreviewView, str, thumbnailImageView));
    }
}
