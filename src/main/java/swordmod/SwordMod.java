package swordmod;

import swordmod.JackedinVr.JackedInVr;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SwordMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SwordMod
{
    public static final String MODID = "forgeyoursword";
    public static final String MODNAME = "YOUR MOD NAME HERE";
    public static String VERSION = "0.0.1";

    public static SwordMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    
    public static CustomSword mySword;
    public static Tier myTier;

    public SwordMod() {

        //*********** INITIALIZE MATERIALS ******************
 /*Mining Level Notes

            Can mine the same as...
         * Mining Level = 1 : Wood
         * Mining Level = 2 : Stone
         * Mining Level = 3 : Iron 
         * Mining Level >= 4: Netherite 
         * 
         */

        /*Max Uses Notes

         * maxUses = 2000  : Netherite
         
        */

        /* Fastest Mining Speed Notes

         * miningSpeed = 12  : Gold
         
        */

        /* Max Damage Bonus Notes

         * damageBonus =  4 : Netherite
         
        */

         /* Max enchantability Bonus Notes

         * damageBonus =  22 : Gold
         
        */

        //addTier(int miningLevel, int maxUses, float miningSpeed, float damageBonus, int enchantability){
        myTier = JackedInVr.addTier(4,200000, 20, 4.5F, 22);


        mySword = new CustomSword();



        //*********** INITIALIZE VARIABLES ******************

         /*Mining Level Notes

            Can mine the same as...
         * Mining Level = 1 : Wood
         * Mining Level = 2 : Stone
         * Mining Level = 3 : Iron 
         * Mining Level >= 4: Netherite
         * 
         */

        /*Max Uses Notes

         * maxUses = 2000  : Netherite
         
        */

        /* Fastest Mining Speed Notes

         * miningSpeed = 12  : Gold
         
        */

        /* Max Damage Bonus Notes

         * damageBonus =  4 : netherite
         
        */

         /* Max enchantability Bonus Notes

         * damageBonus =  22 : Gold
         
        */

        

        // ****************** REGISTER ITEMS ******************
    JackedInVr.registerItem(mySword,"my_sword");
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ JackedInVr.doItemRegistry(event); }

}
