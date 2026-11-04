package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.l1;
import io.intercom.android.sdk.blocks.lib.BlocksViewHolder;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.models.carousel.Appearance;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ContentLayoutManager {
    private final BlocksViewHolder blocksViewHolder;
    private final Context context;

    public ContentLayoutManager(Context context, BlocksViewHolder blocksViewHolder) {
        this.context = context;
        this.blocksViewHolder = blocksViewHolder;
    }

    @l1
    void renderBlock(Block block, String str, LinearLayout linearLayout) {
        linearLayout.addView(block.getType().getView(this.blocksViewHolder, block, linearLayout, new BlockMetadata.Builder().withAppearance(new Appearance.Builder().withTextColor(str)).build()));
    }

    public void renderCarouselScreen(CarouselScreen carouselScreen, FrameLayout frameLayout) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.context).inflate(this.blocksViewHolder.getLayout(), (ViewGroup) frameLayout, false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.gravity = carouselScreen.getGravity();
        linearLayout.setLayoutParams(layoutParams);
        frameLayout.addView(linearLayout);
        renderContent(carouselScreen.getBlocks(), carouselScreen.getTextColor(), linearLayout);
    }

    @l1
    void renderContent(List<Block> list, String str, LinearLayout linearLayout) {
        Iterator<Block> it = list.iterator();
        while (it.hasNext()) {
            renderBlock(it.next(), str, linearLayout);
        }
    }
}
