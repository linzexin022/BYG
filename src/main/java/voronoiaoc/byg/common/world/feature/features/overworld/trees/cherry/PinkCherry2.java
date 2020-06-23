package voronoiaoc.byg.common.world.feature.features.overworld.trees.cherry;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ModifiableTestableWorld;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;

public class PinkCherry2 extends BYGAbstractTreeFeature<DefaultFeatureConfig> {

    public PinkCherry2(Codec<DefaultFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, ServerWorldAccess worldIn, Random rand, BlockPos pos, BlockBox boundsIn) {
        int randTreeHeight = 8 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getDimensionHeight()) {
            BlockPos blockpos = pos.down();
            if (!isDesiredGround(worldIn, blockpos, Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.doesTreeFit(worldIn, pos, randTreeHeight)) {
                return false;
            } else {
                setGroundBlock(worldIn, Blocks.DIRT, mainmutable);

                this.treeLog(changedBlocks, worldIn, mainmutable, boundsIn);
                for (int buildTrunk = 0; buildTrunk <= randTreeHeight; buildTrunk++) {
                    this.treeLog(changedBlocks, worldIn, mainmutable.move(Direction.UP), boundsIn);
                }
                mainmutable.set(pos);

                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 3, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 3, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 3, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 2, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 2, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 2, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 2, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 2, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 2, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 2, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 2, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 1, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 1, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 1, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 1, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 1, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 1, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 1, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 1, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight + 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight + 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight + 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight + 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight + 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight + 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight + 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight + 1, 1), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, ServerWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.CHERRY_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, ServerWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.CHERRY_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, ServerWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        BlockPos.Mutable blockpos = new BlockPos.Mutable().set(pos);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos, BYGBlockList.PINK_CHERRY_LEAVES.getDefaultState(), boundingBox);
        }
    }


    private boolean doesTreeFit(ModifiableTestableWorld reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 2;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canTreePlaceHere(reader, pos.set(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}