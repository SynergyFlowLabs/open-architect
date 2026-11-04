package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.v;
import coil.request.f;
import coil.request.i;
import coil.request.r;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.ConversationRating;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class ConversationRatingCard implements ConversationRatingBlock {
    private static final long ANIMATION_DURATION_MS = 200;
    private static final float DESELECTED_RATING_SCALE = 1.0f;
    private static final float DIALOG_HORIZONTAL_MARGIN = 16.0f;
    private static final float RATING_HORIZONTAL_PADDING = 17.0f;
    private static final float RATING_VERTICAL_PADDING = 14.0f;
    private static final float SELECTED_RATING_SCALE = 1.2f;
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private ConversationRating conversationRating;
    private LinearLayout rootLayout;
    private final View.OnClickListener ratingClickListener = new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIndexOf = ConversationRatingCard.this.ratingViews.indexOf(view);
            if (iIndexOf == -1 || ConversationRatingCard.this.ratingViews.size() != ConversationRatingCard.this.conversationRating.getOptions().size()) {
                return;
            }
            ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
            conversationRatingCard.rateConversation(conversationRatingCard.conversationRating, ConversationRatingCard.this.conversationRating.getOptions().get(iIndexOf));
            ConversationRatingCard.this.updateSelectedRating();
        }
    };
    private final List<ImageView> ratingViews = new ArrayList();
    private final ColorFilter deselectedFilter = ColorUtils.newGreyscaleFilter();

    ConversationRatingCard(Api api, String str, Provider<AppConfig> provider) {
        this.api = api;
        this.conversationId = str;
        this.appConfigProvider = provider;
    }

    public static /* synthetic */ Unit a(ConversationRatingCard conversationRatingCard, Context context) {
        conversationRatingCard.showRemarkDialog(context);
        return null;
    }

    private View createConversationRatingBlock(ConversationRating conversationRating, ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        this.ratingViews.clear();
        this.conversationRating = conversationRating;
        this.rootLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
        updateViewVisibility();
        IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button);
        intercomPrimaryButton.setText(context.getString(R.string.intercom_tell_us_more));
        intercomPrimaryButton.setOnClick(new Function0() { // from class: io.intercom.android.sdk.blocks.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationRatingCard.a(this.f291523a, context);
            }
        });
        setupRatingsLayout();
        updateSelectedRating();
        return this.rootLayout;
    }

    private void deselectView(ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).setDuration(ANIMATION_DURATION_MS).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    @p0
    private ConversationRatingOption findSelectedOption() {
        for (ConversationRatingOption conversationRatingOption : this.conversationRating.getOptions()) {
            if (conversationRatingOption.getIndex().equals(this.conversationRating.getRatingIndex())) {
                return conversationRatingOption;
            }
        }
        return null;
    }

    @l1
    @v
    static int getEmojiDrawableForUnicode(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "1f603":
                return R.drawable.intercom_reaction_happy;
            case "1f610":
                return R.drawable.intercom_reaction_neutral;
            case "1f615":
                return R.drawable.intercom_reaction_sad;
            case "1f620":
                return R.drawable.intercom_reaction_angry;
            case "1f929":
                return R.drawable.intercom_reaction_star_struck;
            default:
                return 0;
        }
    }

    private static String imageUrlForUnicode(String str) {
        return "https://js.intercomcdn.com/images/stickers/" + str + ".png";
    }

    private void loadEmojiWithFallback(Context context, final String str, final ImageView imageView) {
        IntercomCoilKt.loadIntercomImage(context, new i.a(context).j(imageUrlForUnicode(str)).l0(imageView).D(new i.b() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.5
            @Override // coil.request.i.b
            public void onCancel(@NonNull i iVar) {
            }

            @Override // coil.request.i.b
            public void onError(@NonNull i iVar, @NonNull f fVar) {
                int emojiDrawableForUnicode = ConversationRatingCard.getEmojiDrawableForUnicode(str);
                if (emojiDrawableForUnicode != 0) {
                    imageView.setImageResource(emojiDrawableForUnicode);
                }
            }

            @Override // coil.request.i.b
            public void onStart(@NonNull i iVar) {
            }

            @Override // coil.request.i.b
            public void onSuccess(@NonNull i iVar, @NonNull r rVar) {
            }
        }).f());
    }

    private void selectView(float f10, ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f10).scaleY(f10).setDuration(ANIMATION_DURATION_MS).start();
        imageView.clearColorFilter();
    }

    private void setupRatingsLayout() {
        LinearLayout linearLayout = (LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout);
        Context context = this.rootLayout.getContext();
        int iDpToPx = ScreenUtils.dpToPx(RATING_VERTICAL_PADDING, context);
        int iDpToPx2 = ScreenUtils.dpToPx(RATING_HORIZONTAL_PADDING, context);
        for (int i10 = 0; i10 < this.conversationRating.getOptions().size(); i10++) {
            ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i10);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            ImageView imageView = new ImageView(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.intercom_conversation_rating_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
            layoutParams.setMargins(iDpToPx2, iDpToPx, iDpToPx2, iDpToPx);
            imageView.setLayoutParams(layoutParams);
            imageView.setLongClickable(false);
            loadEmojiWithFallback(context, conversationRatingOption.getUnicode(), imageView);
            imageView.setOnClickListener(this.ratingClickListener);
            frameLayout.addView(imageView);
            linearLayout.addView(frameLayout);
            this.ratingViews.add(imageView);
        }
    }

    private void showRemarkDialog(Context context) {
        androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(context);
        aVar.setTitle(R.string.intercom_tell_us_more);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iDpToPx = ScreenUtils.dpToPx(DIALOG_HORIZONTAL_MARGIN, context);
        layoutParams.setMargins(iDpToPx, 0, iDpToPx, 0);
        final EditText editText = new EditText(context);
        editText.getBackground().mutate().setColorFilter(this.appConfigProvider.get().getPrimaryColor(), PorterDuff.Mode.SRC_ATOP);
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        aVar.setView(linearLayout);
        aVar.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                String string = editText.getText().toString();
                ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
                conversationRatingCard.addRemarkToConversation(conversationRatingCard.conversationRating, string);
            }
        });
        aVar.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.cancel();
            }
        });
        final androidx.appcompat.app.c cVarCreate = aVar.create();
        cVarCreate.show();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z10) {
                if (!z10 || cVarCreate.getWindow() == null) {
                    return;
                }
                cVarCreate.getWindow().setSoftInputMode(5);
            }
        });
        cVarCreate.m(-1).setTextColor(this.appConfigProvider.get().getPrimaryColor());
        cVarCreate.m(-2).setTextColor(this.appConfigProvider.get().getPrimaryColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelectedRating() {
        if (this.conversationRating.getOptions().size() == this.ratingViews.size()) {
            for (int i10 = 0; i10 < this.conversationRating.getOptions().size(); i10++) {
                ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i10);
                ImageView imageView = this.ratingViews.get(i10);
                int i11 = 1 ^ (-1);
                if (this.conversationRating.getRatingIndex().intValue() == -1) {
                    selectView(1.0f, imageView);
                } else if (this.conversationRating.getRatingIndex().equals(conversationRatingOption.getIndex())) {
                    selectView(SELECTED_RATING_SCALE, imageView);
                } else {
                    deselectView(imageView);
                }
            }
        }
    }

    private void updateViewVisibility() {
        if (this.rootLayout != null) {
            boolean z10 = this.conversationRating.getRatingIndex().intValue() != -1;
            boolean zIsEmpty = TextUtils.isEmpty(this.conversationRating.getRemark());
            ((TextView) this.rootLayout.findViewById(R.id.rate_your_conversation_text_view)).setVisibility(!zIsEmpty ? 8 : 0);
            ((LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout)).setVisibility(!zIsEmpty ? 8 : 0);
            ((IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button)).setVisibility((z10 && zIsEmpty) ? 0 : 8);
            ((LinearLayout) this.rootLayout.findViewById(R.id.intercom_you_rated_layout)).setVisibility(zIsEmpty ? 8 : 0);
            ConversationRatingOption conversationRatingOptionFindSelectedOption = findSelectedOption();
            if (conversationRatingOptionFindSelectedOption != null) {
                ImageView imageView = (ImageView) this.rootLayout.findViewById(R.id.intercom_you_rated_image_view);
                loadEmojiWithFallback(imageView.getContext(), conversationRatingOptionFindSelectedOption.getUnicode(), imageView);
            }
        }
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock
    public View addConversationRatingBlock(ConversationRating conversationRating, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        return createConversationRatingBlock(conversationRating, viewGroup);
    }

    @l1
    void addRemarkToConversation(ConversationRating conversationRating, String str) {
        if (TextUtils.isEmpty(conversationRating.getRemark())) {
            conversationRating.setRemark(str);
            this.api.addConversationRatingRemark(this.conversationId, str);
            updateViewVisibility();
        }
    }

    @l1
    void rateConversation(ConversationRating conversationRating, ConversationRatingOption conversationRatingOption) {
        if (conversationRating.getRatingIndex().equals(conversationRatingOption.getIndex())) {
            return;
        }
        conversationRating.setRatingIndex(conversationRatingOption.getIndex().intValue());
        this.api.rateConversation(this.conversationId, conversationRatingOption.getIndex().intValue());
        updateViewVisibility();
    }
}
