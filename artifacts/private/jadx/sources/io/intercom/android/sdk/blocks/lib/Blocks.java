package io.intercom.android.sdk.blocks.lib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.models.carousel.Appearance;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class Blocks {
    private final Appearance appearance;
    private final LayoutInflater inflater;
    private final Twig twig;

    public Blocks(Context context, Twig twig) {
        this.inflater = LayoutInflater.from(context);
        this.twig = twig;
        this.appearance = Appearance.NULL;
    }

    public LinearLayout createBlocks(List<Block> list, BlocksViewHolder blocksViewHolder) {
        LinearLayout linearLayout = (LinearLayout) this.inflater.inflate(blocksViewHolder.getLayout(), (ViewGroup) null);
        if (list != null) {
            int i10 = 7 << 0;
            int i11 = 0;
            while (i11 < list.size()) {
                Block block = list.get(i11);
                try {
                    linearLayout.addView(block.getType().getView(blocksViewHolder, block, linearLayout, new BlockMetadata.Builder().withAppearance(this.appearance.toBuilder()).isFirstObject(Boolean.valueOf(i11 == 0)).isLastObject(Boolean.valueOf(i11 == list.size() - 1)).build()));
                } catch (BlockTypeNotImplementedException e10) {
                    this.twig.e(e10, "Error creating view for block with type %s ", block.getType());
                }
                i11++;
            }
        }
        return linearLayout;
    }

    public Blocks(Context context, Twig twig, Appearance appearance) {
        this.inflater = LayoutInflater.from(context);
        this.twig = twig;
        this.appearance = appearance;
    }
}
