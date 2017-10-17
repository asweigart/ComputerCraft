package dan200.computercraft.shared.pocket.inventory;

import dan200.computercraft.shared.computer.core.IComputer;
import dan200.computercraft.shared.computer.core.IContainerComputer;
import dan200.computercraft.shared.media.inventory.ContainerHeldItem;
import dan200.computercraft.shared.pocket.items.ItemPocketComputer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

import javax.annotation.Nullable;

public class ContainerPocketComputer extends ContainerHeldItem
    implements IContainerComputer
{
    public ContainerPocketComputer( EntityPlayer player, EnumHand hand )
    {
        super( player, hand );
    }

    @Nullable
    @Override
    public IComputer getComputer()
    {
        ItemStack stack = getStack();
        if( !stack.isEmpty() && stack.getItem() instanceof ItemPocketComputer )
        {
            return ((ItemPocketComputer) stack.getItem()).getServerComputer( stack );
        }
        else
        {
            return null;
        }
    }
}
