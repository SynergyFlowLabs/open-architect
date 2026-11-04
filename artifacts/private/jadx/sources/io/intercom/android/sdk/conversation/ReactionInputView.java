package io.intercom.android.sdk.conversation;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import coil.request.i;
import coil.target.c;
import com.intercom.twig.Twig;
import e.a;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.models.Reaction;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class ReactionInputView extends LinearLayout {
    private static final float REACTION_SCALE = 2.5f;
    private static final int VIBRATION_DURATION_MS = 10;
    private final ColorFilter deselectedFilter;
    Integer highlightedViewIndex;
    private ReactionListener listener;
    private ReactionReply reactionReply;
    private final List<ImageView> reactionViews;
    int reactionsLoaded;
    private final View.OnTouchListener touchListener;
    private final Twig twig;
    private final Vibrator vibrator;

    public ReactionInputView(Context context) {
        this(context, null, 0);
    }

    private void resetView() {
        removeAllViews();
        this.reactionViews.clear();
    }

    void deselectViewAtIndex(int i10) {
        ImageView imageView = this.reactionViews.get(i10);
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    Integer getCurrentSelectedIndex() {
        int i10;
        while (i10 < getChildCount()) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            i10 = (reactionIndex == null || reactionIndex.equals(Integer.valueOf(this.reactionReply.getReactionSet().get(i10).getIndex()))) ? 0 : i10 + 1;
            return Integer.valueOf(i10);
        }
        return null;
    }

    void handleTouchUp() {
        Reaction reaction;
        Integer num = this.highlightedViewIndex;
        if (num != null && num.intValue() >= 0 && this.highlightedViewIndex.intValue() < this.reactionReply.getReactionSet().size() && (reaction = this.reactionReply.getReactionSet().get(this.highlightedViewIndex.intValue())) != null && (this.reactionReply.getReactionIndex() == null || reaction.getIndex() != this.reactionReply.getReactionIndex().intValue())) {
            this.reactionReply.setReactionIndex(reaction.getIndex());
            ReactionListener reactionListener = this.listener;
            if (reactionListener != null) {
                reactionListener.onReactionSelected(reaction);
            }
        }
        highlightSelectedReaction();
        this.highlightedViewIndex = null;
    }

    void highlightSelectedReaction() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i10);
            if (reactionIndex == null || reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                selectViewAtIndex(1.0f, i10);
            } else {
                deselectViewAtIndex(i10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchListener(this.touchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnTouchListener(null);
    }

    public void preloadReactionImages(ReactionReply reactionReply) {
        Iterator<Reaction> it = reactionReply.getReactionSet().iterator();
        while (it.hasNext()) {
            IntercomCoilKt.loadIntercomImage(getContext(), new i.a(getContext()).j(it.next().getImageUrl()).f());
        }
    }

    void selectViewAtIndex(float f10, int i10) {
        ImageView imageView = this.reactionViews.get(i10);
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f10).scaleY(f10).setDuration(200L).start();
        imageView.clearColorFilter();
    }

    public void setUpReactions(ReactionReply reactionReply, boolean z10, ReactionListener reactionListener) {
        final Context context = getContext();
        this.reactionReply = reactionReply;
        this.listener = reactionListener;
        resetView();
        List<Reaction> reactionSet = reactionReply.getReactionSet();
        final int size = reactionSet.size();
        int i10 = 0;
        while (i10 < reactionSet.size()) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            final ImageView imageView = new ImageView(context);
            int dimensionPixelSize = this.getResources().getDimensionPixelSize(R.dimen.intercom_reaction_size);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            imageView.setPivotY(this.getResources().getDimensionPixelSize(R.dimen.intercom_reaction_offset));
            imageView.setPivotX(dimensionPixelSize / 2);
            this.reactionViews.add(imageView);
            frameLayout.addView(imageView);
            Reaction reaction = reactionSet.get(i10);
            ReactionInputView reactionInputView = this;
            final boolean z11 = z10;
            IntercomCoilKt.loadIntercomImage(context, new i.a(context).m0(new c() { // from class: io.intercom.android.sdk.conversation.ReactionInputView.1
                @Override // coil.target.c
                public void onError(@Nullable Drawable drawable) {
                }

                @Override // coil.target.c
                public void onStart(@Nullable Drawable drawable) {
                }

                @Override // coil.target.c
                public void onSuccess(@NotNull Drawable drawable) {
                    imageView.setImageDrawable(drawable);
                    ReactionInputView reactionInputView2 = ReactionInputView.this;
                    int i11 = reactionInputView2.reactionsLoaded + 1;
                    reactionInputView2.reactionsLoaded = i11;
                    if (i11 == size) {
                        if (z11) {
                            reactionInputView2.setVisibility(0);
                            ReactionInputView reactionInputView3 = ReactionInputView.this;
                            reactionInputView3.setY(reactionInputView3.getHeight() + ScreenUtils.dpToPx(60.0f, context));
                            ReactionInputView.this.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
                            return;
                        }
                        reactionInputView2.setVisibility(0);
                    }
                }
            }).j(reaction.getImageUrl()).f());
            Integer reactionIndex = reactionReply.getReactionIndex();
            if (reactionIndex != null && !reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                reactionInputView.deselectViewAtIndex(i10);
            }
            reactionInputView.addView(frameLayout);
            i10++;
            this = reactionInputView;
            z10 = z11;
        }
    }

    @a({"MissingPermission"})
    void vibrateForSelection() {
        if (DeviceUtils.hasPermission(getContext(), "android.permission.VIBRATE")) {
            this.vibrator.vibrate(10L);
        }
    }

    public ReactionInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReactionInputView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.twig = LumberMill.getLogger();
        this.highlightedViewIndex = null;
        this.reactionsLoaded = 0;
        this.touchListener = new View.OnTouchListener() { // from class: io.intercom.android.sdk.conversation.ReactionInputView.2
            private final Rect touchRect = new Rect();

            private void handleTouchMove(MotionEvent motionEvent) {
                ReactionInputView.this.getHitRect(this.touchRect);
                if (!this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    ReactionInputView reactionInputView = ReactionInputView.this;
                    if (reactionInputView.highlightedViewIndex != null) {
                        reactionInputView.highlightSelectedReaction();
                    }
                    ReactionInputView.this.highlightedViewIndex = null;
                    return;
                }
                for (int i11 = 0; i11 < ReactionInputView.this.getChildCount(); i11++) {
                    ReactionInputView.this.getChildAt(i11).getHitRect(this.touchRect);
                    if (this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        Integer num = ReactionInputView.this.highlightedViewIndex;
                        if (num == null || num.intValue() != i11) {
                            ReactionInputView.this.vibrateForSelection();
                            ReactionInputView.this.selectViewAtIndex(2.5f, i11);
                        }
                        ReactionInputView reactionInputView2 = ReactionInputView.this;
                        Integer num2 = reactionInputView2.highlightedViewIndex;
                        if (num2 == null) {
                            Integer currentSelectedIndex = reactionInputView2.getCurrentSelectedIndex();
                            if (currentSelectedIndex != null && currentSelectedIndex.intValue() != i11) {
                                ReactionInputView.this.deselectViewAtIndex(currentSelectedIndex.intValue());
                            }
                        } else if (num2.intValue() != i11) {
                            ReactionInputView reactionInputView3 = ReactionInputView.this;
                            reactionInputView3.deselectViewAtIndex(reactionInputView3.highlightedViewIndex.intValue());
                        }
                        ReactionInputView.this.highlightedViewIndex = Integer.valueOf(i11);
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0018  */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    handleTouchMove(motionEvent);
                } else if (actionMasked == 1) {
                    ReactionInputView.this.handleTouchUp();
                } else if (actionMasked == 2) {
                    handleTouchMove(motionEvent);
                }
                return true;
            }
        };
        this.reactionViews = new ArrayList();
        setVisibility(8);
        if (isInEditMode()) {
            this.vibrator = null;
        } else {
            this.vibrator = (Vibrator) context.getSystemService("vibrator");
        }
        this.deselectedFilter = ColorUtils.newGreyscaleFilter();
    }
}
