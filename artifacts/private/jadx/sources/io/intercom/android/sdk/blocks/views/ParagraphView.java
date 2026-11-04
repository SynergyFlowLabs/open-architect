package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.d;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
@e.a({"ViewConstructor"})
public class ParagraphView extends AppCompatTextView {
    private static final int CAROUSEL_LINE_SPACING_DP = 8;
    private static final int DEFAULT_LINE_SPACING_DP = 2;
    private static final int POST_BOTTOM_MARGIN_DP = 24;
    private static final int POST_LINE_SPACING_DP = 4;
    private final BlockAlignment alignment;
    private final AppConfig appConfig;
    private final BlockMetadata blockMetadata;
    private final Context context;
    private final StyleType style;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.views.ParagraphView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        static {
            int[] iArr = new int[StyleType.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$StyleType = iArr;
            try {
                iArr[StyleType.ADMIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.ARTICLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.NOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CONTAINER_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.POST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CHAT_FULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CAROUSEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.USER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ParagraphView(Context context, StyleType styleType, BlockAlignment blockAlignment, AppConfig appConfig, BlockMetadata blockMetadata) {
        super(context);
        this.context = context;
        this.style = styleType;
        this.alignment = blockAlignment;
        this.appConfig = appConfig;
        this.blockMetadata = blockMetadata;
        applyParagraphStyle();
    }

    private void applyParagraphStyle() {
        BlockUtils.createLayoutParams(this, -2, -2);
        BlockUtils.setDefaultMarginBottom(this);
        setLineSpacing(ScreenUtils.dpToPx(2.0f, this.context), 1.0f);
        setTextSize(16.0f);
        setTextIsSelectable(false);
        setEllipsize(TextUtils.TruncateAt.END);
        setScrollContainer(false);
        setFocusable(false);
        setClickable(false);
        setLongClickable(false);
        setGravity(this.alignment.getGravity());
        setMovementMethod(new TrackingLinkMovementMethod());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int primaryColor = this.appConfig.getPrimaryColor();
        switch (AnonymousClass1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            case 1:
                setTextColor(d.g(this.context, R.color.intercom_grey_800));
                setLinkTextColor(ColorUtils.primaryOrBlackAccessibility(this.context, this.appConfig));
                break;
            case 2:
                setTextColor(d.g(this.context, R.color.intercom_grey_700));
                setLinkTextColor(ColorUtils.primaryOrDarkColor(this.context, this.appConfig));
                break;
            case 3:
            case 4:
                setTextColor(d.g(this.context, R.color.intercom_grey_700));
                setLinkTextColor(ColorUtils.primaryOrBlackAccessibility(this.context, this.appConfig));
                break;
            case 5:
                marginLayoutParams.bottomMargin = ScreenUtils.dpToPx(24.0f, this.context);
                setLineSpacing(ScreenUtils.dpToPx(4.0f, this.context), 1.0f);
                setTextColor(d.g(this.context, R.color.intercom_white));
                setLinkTextColor(ColorUtils.lightenColor(primaryColor));
                break;
            case 6:
                setMovementMethod(null);
                setTextSize(14.0f);
                setTextColor(d.g(this.context, R.color.intercom_grey_600));
                setLinkTextColor(ColorUtils.primaryOrDarkColor(this.context, this.appConfig));
                break;
            case 7:
                setTextSize(20.0f);
                setLineSpacing(ScreenUtils.dpToPx(8.0f, this.context), 1.0f);
                String textColor = this.blockMetadata.getAppearance().getTextColor();
                if (!textColor.isEmpty()) {
                    int color = Color.parseColor(textColor);
                    setTextColor(color);
                    setLinkTextColor(color);
                }
                break;
            default:
                setIncludeFontPadding(false);
                ColorUtils.setTextColorWhiteOrDark(this, this.appConfig.isPrimaryColorRenderDarkText());
                break;
        }
    }

    public ParagraphView(Context context, StyleType styleType, BlockAlignment blockAlignment, AppConfig appConfig) {
        this(context, styleType, blockAlignment, appConfig, BlockMetadata.NULL);
    }
}
