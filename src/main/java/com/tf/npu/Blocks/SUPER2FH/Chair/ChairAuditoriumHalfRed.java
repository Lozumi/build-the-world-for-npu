package com.tf.npu.Blocks.SUPER2FH.Chair;

import com.tf.npu.Init.ModItems;
import com.tf.npu.Init.SUPER2FH.ModBlocks.ChairBlocks;
import com.tf.npu.Init.SUPER2FH.ModItems.ChairItems;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class ChairAuditoriumHalfRed extends BlockFourSideFacingTemplate {
    public ChairAuditoriumHalfRed() {
        super();
        this.setUnlocalizedName("chair_auditorium_half_red");
        this.setRegistryName("npu:chair_auditorium_half_red");
        this.setCreativeTab(NPU.CHAIR);
        ChairItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ChairBlocks.BLOCKS.add(this);
    }
}